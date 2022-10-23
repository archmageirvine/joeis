package irvine.oeis.a015;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A015844 Numbers k such that phi(k) | sigma(k + 6).
 * @author Sean A. Irvine
 */
public class A015844 extends Sequence1 {

  private FactorSequence mFactorSequenceA = Jaguar.factor(1);
  private FactorSequence mFactorSequenceB = Jaguar.factor(2);
  private FactorSequence mFactorSequenceC = Jaguar.factor(3);
  private FactorSequence mFactorSequenceD = Jaguar.factor(4);
  private FactorSequence mFactorSequenceE = Jaguar.factor(5);
  private FactorSequence mFactorSequenceF = Jaguar.factor(6);
  private long mN = 6;

  @Override
  public Z next() {
    while (true) {
      final Z phi = mFactorSequenceA.phi();
      mFactorSequenceA = mFactorSequenceB;
      mFactorSequenceB = mFactorSequenceC;
      mFactorSequenceC = mFactorSequenceD;
      mFactorSequenceD = mFactorSequenceE;
      mFactorSequenceE = mFactorSequenceF;
      mFactorSequenceF = Jaguar.factor(++mN);
      if (mFactorSequenceF.sigma().mod(phi).isZero()) {
        return Z.valueOf(mN - 6);
      }
    }
  }
}
