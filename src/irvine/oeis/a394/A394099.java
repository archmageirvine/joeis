package irvine.oeis.a394;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A394099 allocated for Eric Fodge.
 * @author Sean A. Irvine
 */
public class A394099 extends Sequence2 {

  private long mN = 1;

  @Override
  public Z next() {
    final FactorSequence fn = Jaguar.factor(++mN);
    Z m = Z.valueOf(mN).square();
    while (true) {
      final FactorSequence fm = new FactorSequence(Jaguar.factor(m));
      if (fm.bigOmega() > 1) {
        fm.merge(fn);
        final Z lim = Functions.SQRT.z(m.multiply(mN));
        Z best = Z.ONE;
        for (final Z d : fm.divisors()) {
          if (d.compareTo(best) > 0 && d.compareTo(lim) <= 0) {
            best = d;
          }
        }
        if (best.equals(mN)) {
          return m;
        }
      }
      m = m.subtract(1);
    }
  }
}
