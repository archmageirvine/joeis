package irvine.oeis.a032;

/**
 * A032898 Numbers whose base-10 representation Sum_{i=0..m} d(i)*10^i, d(m) &gt; 0, has d(0) &gt;= d(1) &lt;= d(2) &gt;= ...
 * @author Sean A. Irvine
 */
public class A032898 extends A032890 {

  @Override
  protected int base() {
    return 10;
  }
}
