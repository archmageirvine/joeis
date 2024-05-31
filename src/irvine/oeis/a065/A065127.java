package irvine.oeis.a065;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A065127 Nonsquares with number of prime factors equal to twice the number of distinct prime factors.
 * @author Sean A. Irvine
 */
public class A065127 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (!Predicates.SQUARE.is(++mN)) {
        final FactorSequence fs = Jaguar.factor(mN);
        if (fs.bigOmega() == 2L * fs.omega()) {
          return Z.valueOf(mN);
        }
      }
    }
  }
}

