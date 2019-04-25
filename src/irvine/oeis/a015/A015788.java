package irvine.oeis.a015;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A015788 Numbers k such that phi(k) <code>+ 9</code> | <code>sigma(k + 9)</code>.
 * @author Sean A. Irvine
 */
public class A015788 implements Sequence {

  private FactorSequence mFactorSequenceA = Cheetah.factor(1);
  private FactorSequence mFactorSequenceB = Cheetah.factor(2);
  private FactorSequence mFactorSequenceC = Cheetah.factor(3);
  private FactorSequence mFactorSequenceD = Cheetah.factor(4);
  private FactorSequence mFactorSequenceE = Cheetah.factor(5);
  private FactorSequence mFactorSequenceF = Cheetah.factor(6);
  private FactorSequence mFactorSequenceG = Cheetah.factor(7);
  private FactorSequence mFactorSequenceH = Cheetah.factor(8);
  private FactorSequence mFactorSequenceI = Cheetah.factor(9);
  private long mN = 9;

  @Override
  public Z next() {
    while (true) {
      final Z phi9 = mFactorSequenceA.phi().add(9);
      mFactorSequenceA = mFactorSequenceB;
      mFactorSequenceB = mFactorSequenceC;
      mFactorSequenceC = mFactorSequenceD;
      mFactorSequenceD = mFactorSequenceE;
      mFactorSequenceE = mFactorSequenceF;
      mFactorSequenceF = mFactorSequenceG;
      mFactorSequenceG = mFactorSequenceH;
      mFactorSequenceH = mFactorSequenceI;
      mFactorSequenceI = Cheetah.factor(++mN);
      if (mFactorSequenceI.sigma().mod(phi9).equals(Z.ZERO)) {
        return Z.valueOf(mN - 9);
      }
    }
  }
}
