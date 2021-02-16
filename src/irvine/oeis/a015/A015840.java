package irvine.oeis.a015;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A015840 Numbers k such that phi(k) | sigma(k + 3).
 * @author Sean A. Irvine
 */
public class A015840 implements Sequence {

  private FactorSequence mFactorSequenceA = Cheetah.factor(1);
  private FactorSequence mFactorSequenceB = Cheetah.factor(2);
  private FactorSequence mFactorSequenceC = Cheetah.factor(3);
  private long mN = 3;

  @Override
  public Z next() {
    while (true) {
      final Z phi = mFactorSequenceA.phi();
      mFactorSequenceA = mFactorSequenceB;
      mFactorSequenceB = mFactorSequenceC;
      mFactorSequenceC = Cheetah.factor(++mN);
      if (mFactorSequenceC.sigma().mod(phi).isZero()) {
        return Z.valueOf(mN - 3);
      }
    }
  }
}
