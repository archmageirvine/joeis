package irvine.oeis.a015;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A015837 Numbers k such that phi(k) | sigma(k + 2).
 * @author Sean A. Irvine
 */
public class A015837 implements Sequence {

  private FactorSequence mFactorSequenceA = Jaguar.factor(1);
  private FactorSequence mFactorSequenceB = Jaguar.factor(2);
  private long mN = 2;

  @Override
  public Z next() {
    while (true) {
      final Z phi = mFactorSequenceA.phi();
      mFactorSequenceA = mFactorSequenceB;
      mFactorSequenceB = Jaguar.factor(++mN);
      if (mFactorSequenceB.sigma().mod(phi).isZero()) {
        return Z.valueOf(mN - 2);
      }
    }
  }
}
