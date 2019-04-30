package irvine.oeis.a015;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A015784 <code>Phi(n) + 5 | sigma(n + 5)</code>.
 * @author Sean A. Irvine
 */
public class A015784 implements Sequence {

  private FactorSequence mFactorSequenceA = Cheetah.factor(1);
  private FactorSequence mFactorSequenceB = Cheetah.factor(2);
  private FactorSequence mFactorSequenceC = Cheetah.factor(3);
  private FactorSequence mFactorSequenceD = Cheetah.factor(4);
  private FactorSequence mFactorSequenceE = Cheetah.factor(5);
  private long mN = 5;

  @Override
  public Z next() {
    while (true) {
      final Z phi5 = mFactorSequenceA.phi().add(5);
      mFactorSequenceA = mFactorSequenceB;
      mFactorSequenceB = mFactorSequenceC;
      mFactorSequenceC = mFactorSequenceD;
      mFactorSequenceD = mFactorSequenceE;
      mFactorSequenceE = Cheetah.factor(++mN);
      if (mFactorSequenceE.sigma().mod(phi5).equals(Z.ZERO)) {
        return Z.valueOf(mN - 5);
      }
    }
  }
}
