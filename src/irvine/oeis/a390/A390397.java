package irvine.oeis.a390;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A390397 Numbers whose sum of prime divisors equals the sum of square divisors.
 * @author Sean A. Irvine
 */
public class A390397 extends Sequence1 {

  private long mN = 11;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      Z sum = fs.sopf();
      for (final Z d : fs.divisors()) {
        if (Predicates.SQUARE.is(d)) {
          sum = sum.subtract(d);
        }
      }
      if (sum.isZero()) {
        return Z.valueOf(mN);
      }
    }
  }
}
