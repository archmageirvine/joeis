package irvine.oeis.a068;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.MemoryFunction1;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.a002.A002808;

/**
 * A068992 Composite numbers k such that Sum_{d|k} sigma(d)/tau(d) is an integer.
 * @author Sean A. Irvine
 */
public class A068992 extends A002808 {

  private final MemoryFunction1<Q> mRatio = new MemoryFunction1<>() {
    @Override
    protected Q compute(final int n) {
      final FactorSequence fs = Jaguar.factor(n);
      return new Q(fs.sigma(), fs.sigma0());
    }
  };

  @Override
  public Z next() {
    while (true) {
      final Z c = super.next();
      if (Rationals.SINGLETON.sumdiv(c.intValueExact(), mRatio::get).isInteger()) {
        return c;
      }
    }
  }
}
