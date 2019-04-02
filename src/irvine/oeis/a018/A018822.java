package irvine.oeis.a018;

/**
 * A018822 n is the sum of k nonzero squares for all 3 &lt;= k &lt;= n-14.
 * @author Sean A. Irvine
 */
public class A018822 extends A018820 {

  @Override
  protected int lower() {
    return 3;
  }
}
