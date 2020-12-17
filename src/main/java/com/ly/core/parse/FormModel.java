package com.ly.core.parse;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;
import java.util.Map;

/**
 * @Author: luoy
 * @Date: 2020/4/16 17:51.
 */
@Data
@EqualsAndHashCode(callSuper=true)
public class FormModel extends BaseModel {
    private Map<String, Object> formData;

    @Builder
    public FormModel(Map<String, Object> headers, String name, String description, String url, String method, Map<String, List<Object>> validate, List<TestCase.HookInfo> setup, List<TestCase.HookInfo> teardown, List<TestCase.HookInfo> onFailure, List<Map<String, String>> saveGlobal, List<Map<String, String>> saveMethod, List<Map<String, String>> saveClass, List<Map<String, String>> saveThread, Map<String, Object> formData) {
        super(headers, name, description, url, method, validate, setup, teardown, onFailure, saveGlobal, saveMethod, saveClass, saveThread);
        this.formData = formData;
    }

    @Override
    protected Object data() {
        return formData;
    }
}
