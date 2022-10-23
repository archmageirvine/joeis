package irvine.oeis.a039;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A039912 Triangle related to number of compositions of n into relatively prime summands.
 * @author Sean A. Irvine
 */
public class A039912 extends Sequence2 {

  private long mN = 1;
  private long mM = 0;

  private Z t(final long n, final long m) {
    Z sum = Z.ZERO;
    for (long j = m; j <= n; j += m) {
      sum = sum.signedAdd(((n - j) & 1) == 0, Binomial.binomial(n - 1, j - 1));
    }
    return sum;
  }

  @Override
  public Z next() {
    if (--mM < 2) {
      mM = ++mN;
    }
    return t(mN, mM);
  }
}
