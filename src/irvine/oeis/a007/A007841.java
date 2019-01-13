package irvine.oeis.a007;

import java.io.Serializable;

import irvine.factor.factor.Cheetah;
import irvine.math.MemoryFunction1;
import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A007841.
 * @author Sean A. Irvine
 */
public class A007841 extends A007838 {

  private static class BFunction extends MemoryFunction1<Q> implements Serializable {

    @Override
    protected Q compute(final int n) {
      if (n <= 1) {
        return Q.ONE;
      }
      Q sum = Q.ZERO;
      for (final Z d : Cheetah.factor(n).divisors()) {
        final int e = n / d.intValueExact() - 1;
        sum = sum.add(new Q(Z.ONE, d.pow(e)));
      }
      return sum;
    }
  }

  private final BFunction mB = new BFunction();

  @Override
  protected MemoryFunction1<Q> getB() {
    return mB;
  }
}
