package irvine.oeis.a018;

/**
 * A018821 n is the sum of k nonzero squares for all 2 &lt;= k &lt;= n-14.
 * @author Sean A. Irvine
 */
public class A018821 extends A018820 {

  @Override
  protected int lower() {
    return 2;
  }
}
