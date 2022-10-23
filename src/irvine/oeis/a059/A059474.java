package irvine.oeis.a059;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A059474 Triangle read by rows: T(n,k) is coefficient of z^n*w^k in 1/(1 - 2*z - 2*w + 2*z*w) read by rows in order 00, 10, 01, 20, 11, 02, ...
 * @author Sean A. Irvine
 */
public class A059474 extends Sequence0 {

  private int mN = -1;
  private int mM = 0;

  private Z t(final int n, final int m) {
    Z sum = Z.ZERO;
    for (int k = 0; k <= n; ++k) {
      sum = sum.signedAdd((k & 1) == 0, Binomial.binomial(n, k).multiply(Binomial.binomial(n + m - k, n)).shiftLeft(n + m - k));
    }
    return sum;
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return t(mN - mM, mM);
  }
}
