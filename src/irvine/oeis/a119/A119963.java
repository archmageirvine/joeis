package irvine.oeis.a119;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A119963 Triangle T(n,k), 0 &lt;= k &lt;= n, read by rows, with T(2n,2k) = T(2n+1,2k) = T(2n+1,2k+1) = T(2n+2,2k+1) = binomial(n,k).
 * @author Sean A. Irvine
 */
public class A119963 extends Sequence0 {

  private long mN = -1;
  private long mM = 0;

  /**
   * Compute element of triangle.
   * @param n index
   * @param m index
   * @return value
   */
  public Z t(final long n, final long m) {
    return Binomial.binomial(n / 2 - (m & 1) * (1 - (n & 1)), m / 2);
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return t(mN, mM);
  }
}
