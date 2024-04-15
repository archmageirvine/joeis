package irvine.oeis.a068;

import irvine.math.MemoryFunction1;
import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.a002.A002808;

/**
 * A068975 Composite k such that (k+1) * Sum_{d|k} d/sigma(d) is an integer.
 * @author Sean A. Irvine
 */
public class A068975 extends A002808 {

  private final MemoryFunction1<Long> mSigma = new MemoryFunction1<>() {
    @Override
    protected Long compute(final int n) {
      return Functions.SIGMA.z(n).longValueExact();
    }
  };

  @Override
  public Z next() {
    while (true) {
      final Z c = super.next();
      if (Rationals.SINGLETON.sumdiv(c.intValueExact(), d -> new Q(d, mSigma.get(d))).multiply(c.add(1)).isInteger()) {
        return c;
      }
    }
  }
}
