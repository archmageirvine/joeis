package irvine.oeis.a015;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A015875 Phi(n + 12) | sigma(n) + 12.
 * @author Sean A. Irvine
 */
public class A015875 extends Sequence1 {

  private FactorSequence mFactorSequenceA = Jaguar.factor(1);
  private FactorSequence mFactorSequenceB = Jaguar.factor(2);
  private FactorSequence mFactorSequenceC = Jaguar.factor(3);
  private FactorSequence mFactorSequenceD = Jaguar.factor(4);
  private FactorSequence mFactorSequenceE = Jaguar.factor(5);
  private FactorSequence mFactorSequenceF = Jaguar.factor(6);
  private FactorSequence mFactorSequenceG = Jaguar.factor(7);
  private FactorSequence mFactorSequenceH = Jaguar.factor(8);
  private FactorSequence mFactorSequenceI = Jaguar.factor(9);
  private FactorSequence mFactorSequenceJ = Jaguar.factor(10);
  private FactorSequence mFactorSequenceK = Jaguar.factor(11);
  private FactorSequence mFactorSequenceL = Jaguar.factor(12);
  private long mN = 12;

  @Override
  public Z next() {
    while (true) {
      final Z sigma = mFactorSequenceA.sigma();
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
      mFactorSequenceK = mFactorSequenceL;
      mFactorSequenceL = Jaguar.factor(++mN);
      if (sigma.add(12).mod(mFactorSequenceL.phi()).isZero()) {
        return Z.valueOf(mN - 12);
      }
    }
  }
}
