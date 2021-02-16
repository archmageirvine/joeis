package irvine.oeis.a032;

/**
 * A032873 Numbers whose base-10 representation Sum_{i=0..m} d(i)*10^i has d(m) &gt;= d(m-1) &lt;= d(m-2) &gt;= ...
 * @author Sean A. Irvine
 */
public class A032873 extends A032849 {

  @Override
  protected long base() {
    return 10;
  }

  @Override
  protected boolean initialDirection() {
    return false;
  }
}
