package irvine.oeis.a032;

/**
 * A032867 Numbers whose base-4 representation Sum_{i=0..m} d(i)*4^i has d(m) &gt;= d(m-1) &lt;= d(m-2) &gt;= ...
 * @author Sean A. Irvine
 */
public class A032867 extends A032849 {

  @Override
  protected long base() {
    return 4;
  }

  @Override
  protected boolean initialDirection() {
    return false;
  }
}
