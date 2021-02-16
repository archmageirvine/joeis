package irvine.oeis.a032;

/**
 * A032850 Numbers whose base-3 representation Sum_{i=0..m} d(i)*3^i has d(m) &lt;= d(m-1) &gt;= d(m-2) &lt;= ...
 * @author Sean A. Irvine
 */
public class A032850 extends A032849 {

  @Override
  protected long base() {
    return 3;
  }
}
