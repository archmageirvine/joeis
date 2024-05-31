package irvine.oeis.a070;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A069970.
 * @author Sean A. Irvine
 */
public class A070007 extends Sequence1 {

  private long mN = 14;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      final int omega = fs.omega();
      if (omega > 1) {
        final Z[] t = fs.sopf().divideAndRemainder(omega);
        if (t[1].isZero() && Predicates.SQUARE.is(t[0])) {
          return Z.valueOf(mN);
        }
      }
    }
  }
}
