package irvine.oeis.a015;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A015784 Phi(n) + 5 | sigma(n + 5).
 * @author Sean A. Irvine
 */
public class A015784 extends Sequence1 {

  private FactorSequence mFactorSequenceA = Jaguar.factor(1);
  private FactorSequence mFactorSequenceB = Jaguar.factor(2);
  private FactorSequence mFactorSequenceC = Jaguar.factor(3);
  private FactorSequence mFactorSequenceD = Jaguar.factor(4);
  private FactorSequence mFactorSequenceE = Jaguar.factor(5);
  private long mN = 5;

  @Override
  public Z next() {
    while (true) {
      final Z phi5 = mFactorSequenceA.phi().add(5);
      mFactorSequenceA = mFactorSequenceB;
      mFactorSequenceB = mFactorSequenceC;
      mFactorSequenceC = mFactorSequenceD;
      mFactorSequenceD = mFactorSequenceE;
      mFactorSequenceE = Jaguar.factor(++mN);
      if (mFactorSequenceE.sigma().mod(phi5).isZero()) {
        return Z.valueOf(mN - 5);
      }
    }
  }
}
