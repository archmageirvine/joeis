package irvine.oeis.a015;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A015783 Numbers k such that phi(k) + 4 | sigma(k + 4).
 * @author Sean A. Irvine
 */
public class A015783 extends Sequence1 {

  private FactorSequence mFactorSequenceA = Jaguar.factor(1);
  private FactorSequence mFactorSequenceB = Jaguar.factor(2);
  private FactorSequence mFactorSequenceC = Jaguar.factor(3);
  private FactorSequence mFactorSequenceD = Jaguar.factor(4);
  private long mN = 4;

  @Override
  public Z next() {
    while (true) {
      final Z phi4 = mFactorSequenceA.phi().add(4);
      mFactorSequenceA = mFactorSequenceB;
      mFactorSequenceB = mFactorSequenceC;
      mFactorSequenceC = mFactorSequenceD;
      mFactorSequenceD = Jaguar.factor(++mN);
      if (mFactorSequenceD.sigma().mod(phi4).isZero()) {
        return Z.valueOf(mN - 4);
      }
    }
  }
}
