package irvine.oeis.a066;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066171 Numbers n such that d(n) = phi(n+1) - phi(n), where d(n) denotes the number of divisors of n.
 * @author Sean A. Irvine
 */
public class A066171 extends Sequence1 {

  private FactorSequence mFactorSequence = Jaguar.factor(5);
  private long mN = 5;

  @Override
  public Z next() {
    while (true) {
      final Z t = mFactorSequence.sigma0().add(mFactorSequence.phi());
      mFactorSequence = Jaguar.factor(++mN);
      if (t.equals(mFactorSequence.phi())) {
        return Z.valueOf(mN - 1);
      }
    }
  }
}
