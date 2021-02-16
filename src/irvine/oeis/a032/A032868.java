package irvine.oeis.a032;

/**
 * A032868 Numbers whose base-5 representation Sum_{i=0..m} d(i)*5^i has d(m) &gt;= d(m-1) &lt;= d(m-2) &gt;= ...
 * @author Sean A. Irvine
 */
public class A032868 extends A032849 {

  @Override
  protected long base() {
    return 5;
  }

  @Override
  protected boolean initialDirection() {
    return false;
  }
}
