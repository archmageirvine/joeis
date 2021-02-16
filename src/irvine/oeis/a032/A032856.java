package irvine.oeis.a032;

/**
 * A032856 Numbers whose base-9 representation Sum_{i=0..m} d(i)*9^i has d(m) &lt;= d(m-1) &gt;= d(m-2) &lt;= ...
 * @author Sean A. Irvine
 */
public class A032856 extends A032849 {

  @Override
  protected long base() {
    return 9;
  }
}
