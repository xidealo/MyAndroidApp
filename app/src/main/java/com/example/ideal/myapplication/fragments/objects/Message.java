package com.example.ideal.myapplication.fragments.objects;

public class Message {

    private String id;
    private String date;
    private boolean isCanceled;
    private String serviceName;
    private String userName;
    private String dialogId;
    private String messageTime;
    private String timeId;
    private String orderTime;
    private boolean isRateByUser;
    private boolean isRateByWorker;


    public void setId(String _id) {
        id = _id;
    }

    public void setServiceName(String _serviceName) {
        serviceName = _serviceName;
    }

    public void setUserName(String _userName) {
        userName = _userName;
    }

    public void setDate(String _date) {
        date = _date;
    }

    public void setIsCanceled(boolean _isCanceled) {
        isCanceled = _isCanceled;
    }

    public void setDialogId(String _dialogId) {
        dialogId = _dialogId;
    }

    public void setMessageTime(String _time) {
        messageTime = _time;
    }

    public void setTimeId(String _timeId) {
        timeId = _timeId;
    }

    public void setOrderTime(String _orderTime) {
        orderTime = _orderTime;
    }
    public void setIsRateByUser(boolean _isRate) {
        isRateByUser = _isRate;
    }

    public void setIsRateByWorker(boolean _isRate) {
        isRateByWorker = _isRate;
    }

    public String getId() {
        return id;
    }

    public String getServiceName(){
        return serviceName;
    }

    public String getUserName(){
        return userName;
    }

    public String getDate() {
        return date;
    }

    public boolean getIsCanceled() {
        return isCanceled;
    }

    public String getDialogId() {
        return dialogId;
    }

    public String getMessageTime() {
        return messageTime;
    }

    public String getTimeId() {
        return timeId;
    }

    public String getOrderTime() {
        return orderTime;
    }

    public boolean getIsRateByUser() {
        return isRateByUser;
    }
    public boolean getIsRateByWorker() {
        return isRateByWorker;
    }
}
