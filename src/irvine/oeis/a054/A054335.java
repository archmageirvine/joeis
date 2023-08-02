package irvine.oeis.a054;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A054335 A convolution triangle of numbers based on A000984 (central binomial coefficients of even order).
 * @author Sean A. Irvine
 */
public class A054335 extends Sequence0 {

  private int mN = -1;
  private int mM = 0;

  protected Z t(final int n, final int m) {
    final int k = m / 2;
    if ((m & 1) == 1) {
      return Binomial.binomial(n - k - 1, k).shiftLeft(2L * (n - m));
    } else {
      return Binomial.binomial(2L * n - m, n - k).multiply(Binomial.binomial(n - k, k)).divide(Binomial.binomial(m, k));
    }
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
