package irvine.oeis.a032;

/**
 * A032855 Numbers whose base-8 representation Sum_{i=0..m} d(i)*8^i has d(m) &lt;= d(m-1) &gt;= d(m-2) &lt;= ...
 * @author Sean A. Irvine
 */
public class A032855 extends A032849 {

  @Override
  protected long base() {
    return 8;
  }
}
