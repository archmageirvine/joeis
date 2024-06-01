package irvine.oeis.a070;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A070008 Arithmetic mean of distinct primes dividing n is a power of 2 (powers of 2 are not left out).
 * @author Sean A. Irvine
 */
public class A070008 extends Sequence1 {

  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      final Z[] t = fs.sopf().divideAndRemainder(fs.omega());
      if (t[1].isZero() && Predicates.POWER_OF_TWO.is(t[0])) {
        return Z.valueOf(mN);
      }
    }
  }
}
