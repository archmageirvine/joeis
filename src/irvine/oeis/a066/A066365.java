package irvine.oeis.a066;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.MemoryFunction1;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066239 The floor(1.001*x)-perfect numbers, where f-perfect numbers for an arithmetical function f are defined in A066218.
 * @author Sean A. Irvine
 */
public class A066365 extends Sequence1 {

  private int mN = 1133;

  private final MemoryFunction1<Long> mF = new MemoryFunction1<>() {
    @Override
    protected Long compute(final int n) {
      return Jaguar.factor(n).sigma().subtract(n).abs().longValueExact();
    }
  };

  private boolean is(final int n) {
    long s = mF.get(n);
    final FactorSequence fs = Jaguar.factor(n);
    for (final Z dd : fs.divisors()) {
      final int d = dd.intValue();
      if (d != n) {
        s -= mF.get(d);
        if (s < 0) {
          return false;
        }
      }
    }
    return s == 0;
  }

  @Override
  public Z next() {
    while (true) {
      if (is(++mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
