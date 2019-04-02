package irvine.oeis.a015;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A015785 Phi(n) + 6 | sigma(n + 6).
 * @author Sean A. Irvine
 */
public class A015785 implements Sequence {

  private FactorSequence mFactorSequenceA = Cheetah.factor(1);
  private FactorSequence mFactorSequenceB = Cheetah.factor(2);
  private FactorSequence mFactorSequenceC = Cheetah.factor(3);
  private FactorSequence mFactorSequenceD = Cheetah.factor(4);
  private FactorSequence mFactorSequenceE = Cheetah.factor(5);
  private FactorSequence mFactorSequenceF = Cheetah.factor(6);
  private long mN = 6;

  @Override
  public Z next() {
    while (true) {
      final Z phi6 = mFactorSequenceA.phi().add(6);
      mFactorSequenceA = mFactorSequenceB;
      mFactorSequenceB = mFactorSequenceC;
      mFactorSequenceC = mFactorSequenceD;
      mFactorSequenceD = mFactorSequenceE;
      mFactorSequenceE = mFactorSequenceF;
      mFactorSequenceF = Cheetah.factor(++mN);
      if (mFactorSequenceF.sigma().mod(phi6).equals(Z.ZERO)) {
        return Z.valueOf(mN - 6);
      }
    }
  }
}
