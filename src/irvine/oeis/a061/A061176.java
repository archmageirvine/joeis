package irvine.oeis.a061;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A061176 Coefficients of polynomials ( (1 -x +sqrt(x))^n + (1 -x -sqrt(x))^n )/2.
 * @author Sean A. Irvine
 */
public class A061176 extends Sequence0 {

  private int mN = -1;
  private int mM = 0;

  private Z t(final int n, final int m) {
    Z sum = Z.ZERO;
    for (int k = 0; k <= m; ++k) {
      sum = sum.signedAdd(((m + k) & 1) == 0, Binomial.binomial(n, 2L * k).multiply(Binomial.binomial(n - 2L * k, m - k)));
    }
    return sum;
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
