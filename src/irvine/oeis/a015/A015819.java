package irvine.oeis.a015;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A015819 Numbers k such that phi(k + 3) | sigma(k).
 * @author Sean A. Irvine
 */
public class A015819 implements Sequence {

  private FactorSequence mFactorSequenceA = Cheetah.factor(1);
  private FactorSequence mFactorSequenceB = Cheetah.factor(2);
  private FactorSequence mFactorSequenceC = Cheetah.factor(3);
  private long mN = 3;

  @Override
  public Z next() {
    while (true) {
      final Z sigma = mFactorSequenceA.sigma();
      mFactorSequenceA = mFactorSequenceB;
      mFactorSequenceB = mFactorSequenceC;
      mFactorSequenceC = Cheetah.factor(++mN);
      if (sigma.mod(mFactorSequenceC.phi()).isZero()) {
        return Z.valueOf(mN - 3);
      }
    }
  }
}
