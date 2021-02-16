package irvine.oeis.a032;

/**
 * A032866 Numbers whose base-3 representation Sum_{i=0..m} d(i)*3^i has d(m) &gt;= d(m-1) &lt;= d(m-2) &gt;= ...
 * @author Sean A. Irvine
 */
public class A032866 extends A032849 {

  @Override
  protected long base() {
    return 3;
  }

  @Override
  protected boolean initialDirection() {
    return false;
  }
}
