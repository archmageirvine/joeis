package irvine.oeis.a032;

/**
 * A032870 Numbers whose base-7 representation Sum_{i=0..m} d(i)*7^i has d(m) &gt;= d(m-1) &lt;= d(m-2) &gt;= ...
 * @author Sean A. Irvine
 */
public class A032870 extends A032849 {

  @Override
  protected long base() {
    return 7;
  }

  @Override
  protected boolean initialDirection() {
    return false;
  }
}
