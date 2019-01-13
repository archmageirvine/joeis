package irvine.oeis.a007;

import java.io.Serializable;

import irvine.factor.factor.Cheetah;
import irvine.math.MemoryFunction1;
import irvine.math.factorial.MemoryFactorial;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A007838.
 * @author Sean A. Irvine
 */
public class A007838 extends MemorySequence {

  private static class BFunction extends MemoryFunction1<Q> implements Serializable {

    @Override
    protected Q compute(final int n) {
      if (n <= 1) {
        return Q.ONE;
      }
      Q sum = Q.ZERO;
      for (final Z d : Cheetah.factor(n).divisors()) {
        final int e = n / d.intValueExact() - 1;
        sum = sum.add(new Q(Z.ONE, d.negate().pow(e)));
      }
      return sum;
    }
  }

  private final BFunction mB = new BFunction();
  private final MemoryFactorial mF = new MemoryFactorial();

  protected MemoryFunction1<Q> getB() {
    return mB;
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n == 0) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    for (int k = 1; k <= n; ++k) {
      sum = sum.add(getB().get(k).multiply(mF.factorial(n - 1).divide(mF.factorial(n - k)).multiply(get(n - k))).toZ());
    }
    return sum;
  }
}
