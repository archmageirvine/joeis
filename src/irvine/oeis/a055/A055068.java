package irvine.oeis.a055;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A055068 Triangular array for David G. Cantor's sigma function.
 * @author Sean A. Irvine
 */
public class A055068 extends Sequence0 {

  private long mN = -1;
  private long mM = 0;

  private Z t(final long n, final long k) {
    if (k < 0 || k > n) {
      return Z.ZERO;
    }
    Z prod = Z.ONE;
    for (int j = 1; j <= (k + 1) / 2; ++j) {
      prod = prod.multiply(Binomial.binomial(n + 2L * j - 1 - (k & 1), 4L * j - 1 - (k & 1) * 2));
    }
    return prod;
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

