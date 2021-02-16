package irvine.oeis.a032;

/**
 * A032852 Numbers whose base-5 representation Sum_{i=0..m} d(i)*5^i has d(m) &lt;= d(m-1) &gt;= d(m-2) &lt;= ...
 * @author Sean A. Irvine
 */
public class A032852 extends A032849 {

  @Override
  protected long base() {
    return 5;
  }
}
