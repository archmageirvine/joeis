package irvine.oeis.a015;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A015819 Numbers k such that phi(k + 3) | sigma(k).
 * @author Sean A. Irvine
 */
public class A015819 extends Sequence1 {

  private FactorSequence mFactorSequenceA = Jaguar.factor(1);
  private FactorSequence mFactorSequenceB = Jaguar.factor(2);
  private FactorSequence mFactorSequenceC = Jaguar.factor(3);
  private long mN = 3;

  @Override
  public Z next() {
    while (true) {
      final Z sigma = mFactorSequenceA.sigma();
      mFactorSequenceA = mFactorSequenceB;
      mFactorSequenceB = mFactorSequenceC;
      mFactorSequenceC = Jaguar.factor(++mN);
      if (sigma.mod(mFactorSequenceC.phi()).isZero()) {
        return Z.valueOf(mN - 3);
      }
    }
  }
}
