package xinQing.WebSocket;

/**
 * 用户信息
 *
 * Created by xinQing on 2016/8/20.
 */
public class User {

    private String id;

    private String username;

    public User() {
    }

    public User(String id, String username) {
        this.id = id;
        this.username = username;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
