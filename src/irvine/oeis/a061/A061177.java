package irvine.oeis.a061;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A061177 Coefficients of polynomials ( (1 -x +sqrt(x))^(n+1) - (1 -x -sqrt(x))^(n+1) )/(2*sqrt(x)).
 * @author Sean A. Irvine
 */
public class A061177 extends Sequence0 {

  private int mN = -1;
  private int mM = 0;

  private Z t(final int n, final int m) {
    if (m <= n / 2) {
      Z sum = Z.ZERO;
      for (int k = 0; k <= m; ++k) {
        sum = sum.signedAdd(((m + k) & 1) == 0, Binomial.binomial(n + 1, 2L * k + 1).multiply(Binomial.binomial(n - 2L * k, m - k)));
      }
      return sum;
    } else if ((n & 1) == 0) {
      return t(n, n - m);
    } else {
      return t(n, n - m).negate();
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
