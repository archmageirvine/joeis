package irvine.oeis.a070;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A070311 Numbers n such that sopfr(n) and d(n) are both perfect numbers.
 * @author Sean A. Irvine
 */
public class A070311 extends Sequence1 {

  private long mN = 337;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      if (Predicates.PERFECT.is(fs.sigma0()) && Predicates.PERFECT.is(fs.sopfr())) {
        return Z.valueOf(mN);
      }
    }
  }
}
