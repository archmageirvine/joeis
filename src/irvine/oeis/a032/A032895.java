package irvine.oeis.a032;

/**
 * A032895 Numbers whose base-7 representation Sum_{i=0..m} d(i)*7^i has d(0) &gt;= d(1) &lt;= d(2) &gt;= ...
 * @author Sean A. Irvine
 */
public class A032895 extends A032890 {

  @Override
  protected int base() {
    return 7;
  }
}
