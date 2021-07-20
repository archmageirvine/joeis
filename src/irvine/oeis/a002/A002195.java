package irvine.oeis.a002;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.q.Q;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002195 Numerators of coefficients for numerical integration.
 * @author Sean A. Irvine
 */
public class A002195 implements Sequence {

  private final MemoryFactorial mF = new MemoryFactorial();
  protected int mN = -1;

  private Z c(final int j, final int n) {
    Z s = Z.ZERO;
    for (int i = 0; i <= j / 2; ++i) {
      s = s.signedAdd((i & 1) == 0, Binomial.binomial(j, i).multiply(Z.valueOf(2 * i - j).pow(2 * n + j)));
    }
    return s;
  }

  private Q b(final int k, final int n) {
    Q s = Q.ZERO;
    for (int j = 1; j <= k; ++j) {
      s = s.add(new Q(c(j, n).multiply(Binomial.binomial(k, j)), mF.factorial(2 * n + j).shiftLeft(j)));
    }
    return s;
  }

  protected Q nextQ() {
    if (++mN == 0) {
      return Q.ONE;
    }
    Q sum = Q.ZERO;
    for (int k = 1; k <= 2 * mN; ++k) {
      sum = sum.add(b(k, mN).multiply(Binomial.binomial(2 * mN + k - 1, 2 * mN - 1)));
    }
    return sum;
  }

  @Override
  public Z next() {
    return nextQ().num();
  }
}
