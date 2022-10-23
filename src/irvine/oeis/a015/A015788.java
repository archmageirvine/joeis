package irvine.oeis.a015;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A015788 Numbers k such that phi(k) + 9 | sigma(k + 9).
 * @author Sean A. Irvine
 */
public class A015788 extends Sequence1 {

  private FactorSequence mFactorSequenceA = Jaguar.factor(1);
  private FactorSequence mFactorSequenceB = Jaguar.factor(2);
  private FactorSequence mFactorSequenceC = Jaguar.factor(3);
  private FactorSequence mFactorSequenceD = Jaguar.factor(4);
  private FactorSequence mFactorSequenceE = Jaguar.factor(5);
  private FactorSequence mFactorSequenceF = Jaguar.factor(6);
  private FactorSequence mFactorSequenceG = Jaguar.factor(7);
  private FactorSequence mFactorSequenceH = Jaguar.factor(8);
  private FactorSequence mFactorSequenceI = Jaguar.factor(9);
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
      mFactorSequenceI = Jaguar.factor(++mN);
      if (mFactorSequenceI.sigma().mod(phi9).isZero()) {
        return Z.valueOf(mN - 9);
      }
    }
  }
}
