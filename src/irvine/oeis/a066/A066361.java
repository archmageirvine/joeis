package irvine.oeis.a066;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.MemoryFunction1;
import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066239.
 * @author Sean A. Irvine
 */
public class A066361 extends Sequence1 {

  private static final CR POW = CR.valueOf(new Q(9999, 10000));
  private int mN = 1;

  private final MemoryFunction1<Long> mF = new MemoryFunction1<>() {
    @Override
    protected Long compute(final int n) {
      return CR.valueOf(n).pow(POW).floor().longValueExact();
    }
  };

  private boolean is(final int n) {
    long s = mF.get(n);
    final FactorSequence fs = Jaguar.factor(n);
    for (final Z dd : fs.divisors()) {
      final int d = dd.intValueExact();
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
