package irvine.oeis.a015;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A015837 Numbers n such that phi(n) | sigma(n + 2).
 * @author Sean A. Irvine
 */
public class A015837 implements Sequence {

  private FactorSequence mFactorSequenceA = Cheetah.factor(1);
  private FactorSequence mFactorSequenceB = Cheetah.factor(2);
  private long mN = 2;

  @Override
  public Z next() {
    while (true) {
      final Z phi = mFactorSequenceA.phi();
      mFactorSequenceA = mFactorSequenceB;
      mFactorSequenceB = Cheetah.factor(++mN);
      if (mFactorSequenceB.sigma().mod(phi).equals(Z.ZERO)) {
        return Z.valueOf(mN - 2);
      }
    }
  }
}
