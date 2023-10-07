package irvine.oeis.a066;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066242 The floor((Log x)^2)-perfect numbers, where f-perfect numbers for an arithmetical function f are defined in A066218.
 * @author Sean A. Irvine
 */
public class A066242 extends Sequence1 {

  private long mN = 1;

  private boolean is(final long n) {
    long s = CR.valueOf(n).log().square().floor().longValue();
    final FactorSequence fs = Jaguar.factor(n);
    for (final Z dd : fs.divisors()) {
      final long d = dd.longValue();
      if (d != n) {
        s -= CR.valueOf(d).log().square().floor().longValue();
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
