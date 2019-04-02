package irvine.oeis.a015;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A015783 Phi(n) + 4 | sigma(n + 4).
 * @author Sean A. Irvine
 */
public class A015783 implements Sequence {

  private FactorSequence mFactorSequenceA = Cheetah.factor(1);
  private FactorSequence mFactorSequenceB = Cheetah.factor(2);
  private FactorSequence mFactorSequenceC = Cheetah.factor(3);
  private FactorSequence mFactorSequenceD = Cheetah.factor(4);
  private long mN = 4;

  @Override
  public Z next() {
    while (true) {
      final Z phi4 = mFactorSequenceA.phi().add(4);
      mFactorSequenceA = mFactorSequenceB;
      mFactorSequenceB = mFactorSequenceC;
      mFactorSequenceC = mFactorSequenceD;
      mFactorSequenceD = Cheetah.factor(++mN);
      if (mFactorSequenceD.sigma().mod(phi4).equals(Z.ZERO)) {
        return Z.valueOf(mN - 4);
      }
    }
  }
}
