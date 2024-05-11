package irvine.oeis.a069;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A069066 Sigma(n)+phi(n) is a triangular number.
 * @author Sean A. Irvine
 */
public class A069066 extends Sequence1 {

  private long mN = 2;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      if (Predicates.TRIANGULAR.is(fs.sigma().add(fs.phi()))) {
        return Z.valueOf(mN);
      }
    }
  }
}

