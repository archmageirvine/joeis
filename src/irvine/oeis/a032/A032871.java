package irvine.oeis.a032;

/**
 * A032871 Numbers whose base-8 representation Sum_{i=0..m} d(i)*8^i has d(m) &gt;= d(m-1) &lt;= d(m-2) &gt;= ...
 * @author Sean A. Irvine
 */
public class A032871 extends A032849 {

  @Override
  protected long base() {
    return 8;
  }

  @Override
  protected boolean initialDirection() {
    return false;
  }
}
