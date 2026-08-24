package irvine.oeis.a039;

import irvine.math.MemoryFunction1;
import irvine.math.q.BernoulliSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A039821 Numerators in Stirling expansion of central binomial coefficient C(2*n,n).
 * @author Sean A. Irvine
 */
public class A039821 extends Sequence1 {

  private int mN = 0;
  private final BernoulliSequence mBernoulli = new BernoulliSequence(0);
  private final MemoryFunction1<Z> mCoeff = new MemoryFunction1<Z>() {
    @Override
    protected Z compute(final int n) {
      if (n == 0) {
        return Z.ONE;
      }
      Z sum = Z.ZERO;
      for (int k = 1; k <= n; k += 2) {
        final Z stirlog = mBernoulli.get(k + 1)
          .multiply(Z.EIGHT.pow(k))
          .multiply(Z.ONE.subtract(Z.TWO.pow(k + 1)))
          .divide(k + 1).toZ();
        sum = sum.add(stirlog.multiply(get(n - k)));
      }
      return sum.divide(n);
    }
  };

  @Override
  public Z next() {
    return mCoeff.get(++mN).abs().shiftRight(1);
  }
}
