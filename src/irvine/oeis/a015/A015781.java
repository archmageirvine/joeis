package irvine.oeis.a015;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A015781 Phi(n) + 2 | sigma(n + 2).
 * @author Sean A. Irvine
 */
public class A015781 extends Sequence1 {

  private FactorSequence mFactorSequenceA = Jaguar.factor(1);
  private FactorSequence mFactorSequenceB = Jaguar.factor(2);
  private long mN = 2;

  @Override
  public Z next() {
    while (true) {
      final Z phi2 = mFactorSequenceA.phi().add(2);
      mFactorSequenceA = mFactorSequenceB;
      mFactorSequenceB = Jaguar.factor(++mN);
      if (mFactorSequenceB.sigma().mod(phi2).isZero()) {
        return Z.valueOf(mN - 2);
      }
    }
  }
}
