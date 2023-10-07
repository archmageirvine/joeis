package irvine.oeis.a066;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066239 The floor(1.001*x)-perfect numbers, where f-perfect numbers for an arithmetical function f are defined in A066218.
 * @author Sean A. Irvine
 */
public class A066239 extends Sequence1 {

  private long mN = 1;

  private boolean is(final long n) {
    long s = n * 1001 / 1000;
    final FactorSequence fs = Jaguar.factor(n);
    for (final Z dd : fs.divisors()) {
      final long d = dd.longValue();
      if (d != n) {
        s -= d * 1001 / 1000;
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
