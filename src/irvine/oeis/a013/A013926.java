package irvine.oeis.a013;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A013926 a(n) = (2*n)! * D_{2*n}, where D_{2*n} = (1/Pi) * Integral_{x=0..oo} [1 - x^(2*n) / Product_{j=1..n} (x^2+j^2)] dx.
 * @author Sean A. Irvine
 */
public class A013926 extends Sequence1 {

  private long mN = 0;

  private Z t(final long n, final long k) {
    if (k == 0) {
      return Z.valueOf(n).pow(2 * n);
    } else {
      final Z t = Binomial.binomial(2L * n - 1, k - 1).multiply(Z.valueOf(n - k).pow(2 * n + 1)).multiply2().divide(k);
      return (k & 1) == 0 ? t : t.negate();
    }
  }

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int k = 0; k < mN; ++k) {
      sum = sum.add(t(mN, k));
    }
    return sum.multiply(mN);
  }
}
