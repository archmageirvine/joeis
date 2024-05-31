package irvine.oeis.a056;

import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A056856 Triangle of numbers related to rooted trees and unrooted planar trees.
 * @author Sean A. Irvine
 */
public class A056856 extends Sequence1 {

  private long mN = 0;
  private long mM = 0;

  private Z t(final long n, final long m) {
    Z sum = Z.ZERO;
    final Z t = Binomial.binomial(n - 1, m - 1).multiply(Z.valueOf(n).pow(m - 1));
    for (long k = 0; k <= n - m; ++k) {
      sum = sum.signedAdd(((n - m - k) & 1) == 0, Binomial.binomial(n + k - 1, k).multiply(Functions.STIRLING2.z(n - m + k, k)).multiply(Binomial.binomial(2 * n - m, n - m - k)).multiply(t).divide(Binomial.binomial(n - m + k, k)));
    }
    return sum;
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return t(mN, mM);
  }
}
