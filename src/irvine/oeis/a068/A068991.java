package irvine.oeis.a068;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.MemoryFunction1;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A068991 Numbers k such that Sum_{d divides k} sigma(d)/phi(d) is an integer.
 * @author Sean A. Irvine
 */
public class A068991 extends Sequence1 {

  private int mN = 0;
  private final MemoryFunction1<Q> mRatio = new MemoryFunction1<>() {
    @Override
    protected Q compute(final int n) {
      final FactorSequence fs = Jaguar.factor(n);
      return new Q(fs.sigma(), fs.phi());
    }
  };

  @Override
  public Z next() {
    while (true) {
      if (Rationals.SINGLETON.sumdiv(++mN, mRatio::get).isInteger()) {
        return Z.valueOf(mN);
      }
    }
  }
}
