package irvine.oeis.a015;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A015858 Numbers k such that phi(k) | sigma(k + 11).
 * @author Sean A. Irvine
 */
public class A015858 implements Sequence {

  private FactorSequence mFactorSequenceA = Cheetah.factor(1);
  private FactorSequence mFactorSequenceB = Cheetah.factor(2);
  private FactorSequence mFactorSequenceC = Cheetah.factor(3);
  private FactorSequence mFactorSequenceD = Cheetah.factor(4);
  private FactorSequence mFactorSequenceE = Cheetah.factor(5);
  private FactorSequence mFactorSequenceF = Cheetah.factor(6);
  private FactorSequence mFactorSequenceG = Cheetah.factor(7);
  private FactorSequence mFactorSequenceH = Cheetah.factor(8);
  private FactorSequence mFactorSequenceI = Cheetah.factor(9);
  private FactorSequence mFactorSequenceJ = Cheetah.factor(10);
  private FactorSequence mFactorSequenceK = Cheetah.factor(11);
  private long mN = 11;

  @Override
  public Z next() {
    while (true) {
      final Z phi = mFactorSequenceA.phi();
      mFactorSequenceA = mFactorSequenceB;
      mFactorSequenceB = mFactorSequenceC;
      mFactorSequenceC = mFactorSequenceD;
      mFactorSequenceD = mFactorSequenceE;
      mFactorSequenceE = mFactorSequenceF;
      mFactorSequenceF = mFactorSequenceG;
      mFactorSequenceG = mFactorSequenceH;
      mFactorSequenceH = mFactorSequenceI;
      mFactorSequenceI = mFactorSequenceJ;
      mFactorSequenceJ = mFactorSequenceK;
      mFactorSequenceK = Cheetah.factor(++mN);
      if (mFactorSequenceK.sigma().mod(phi).isZero()) {
        return Z.valueOf(mN - 11);
      }
    }
  }
}
