package irvine.oeis.a032;

/**
 * A032905 Numbers whose base-8 representation Sum_{i=0..m} d(i)*8^i has d(0) &lt;= d(1) &gt;= d(2) &lt;= ...
 * @author Sean A. Irvine
 */
public class A032905 extends A032899 {

  @Override
  protected int base() {
    return 8;
  }
}
