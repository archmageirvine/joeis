package irvine.oeis.a015;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A015820 Numbers k such that phi(k + 4) | sigma(k).
 * @author Sean A. Irvine
 */
public class A015820 implements Sequence {

  private FactorSequence mFactorSequenceA = Jaguar.factor(1);
  private FactorSequence mFactorSequenceB = Jaguar.factor(2);
  private FactorSequence mFactorSequenceC = Jaguar.factor(3);
  private FactorSequence mFactorSequenceD = Jaguar.factor(4);
  private long mN = 4;

  @Override
  public Z next() {
    while (true) {
      final Z sigma = mFactorSequenceA.sigma();
      mFactorSequenceA = mFactorSequenceB;
      mFactorSequenceB = mFactorSequenceC;
      mFactorSequenceC = mFactorSequenceD;
      mFactorSequenceD = Jaguar.factor(++mN);
      if (sigma.mod(mFactorSequenceD.phi()).isZero()) {
        return Z.valueOf(mN - 4);
      }
    }
  }
}
