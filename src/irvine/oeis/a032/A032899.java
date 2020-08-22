package irvine.oeis.a032;

/**
 * A032899 Numbers whose base-2 representation Sum_{i=0..m} d(i)*2^i has d(0) &lt;= d(1) &gt;= d(2) &lt;= ...
 * @author Sean A. Irvine
 */
public class A032899 extends A032890 {

  @Override
  protected int initialDirection() {
    return 1;
  }
}
