package irvine.oeis.a007;

import java.io.Serializable;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.q.Q;
import irvine.math.z.Binomial;
import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007151.
 * @author Sean A. Irvine
 */
public class A007151 implements Sequence, Serializable {

  private final MemoryFactorial mF = new MemoryFactorial();
  private int mN = 0;

  private Q sum1(final int n, final int j, final int i) {
    Q sum = Q.ZERO;
    for (int m = 0; m <= j; ++m) {
      final Q t = new Q(Stirling.secondKind(n - m + j - i - 1, j - m).shiftLeft(m),
        mF.factorial(m).multiply(mF.factorial(n - m + j - i - 1)));
      sum = sum.signedAdd(((m + i) & 1) == 0, t);
    }
    return sum;
  }

  private Q sum2(final int n, final int j) {
    Q sum = Q.ZERO;
    for (int i = 0; i < n; ++i) {
      sum = sum.add(sum1(n, j, i).multiply(Binomial.binomial(j + i - 1, j - 1)));
    }
    return sum;
  }

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    for (int k = 1; k < mN; ++k) {
      Q t = Q.ZERO;
      final Z s = mF.factorial(mN + k - 1);
      for (int j = 1; j <= k; ++j) {
        t = t.add(sum2(mN, j).divide(mF.factorial(k - j)));
      }
      sum = sum.add(t.multiply(s).toZ());
    }
    return sum;
  }
}
