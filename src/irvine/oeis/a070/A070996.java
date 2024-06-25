package irvine.oeis.a070;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A070996 Numbers n whose sum of divisors and number of divisors are both triangular numbers.
 * @author Sean A. Irvine
 */
public class A070996 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      if (Predicates.TRIANGULAR.is(fs.sigma()) && Predicates.TRIANGULAR.is(fs.sigma0())) {
        return Z.valueOf(mN);
      }
    }
  }
}
