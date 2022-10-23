package irvine.oeis.a015;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A015834 Numbers k such that phi(k) | sigma(k + 1).
 * @author Sean A. Irvine
 */
public class A015834 extends Sequence1 {

  private FactorSequence mFactorSequenceA = Jaguar.factor(1);
  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      final Z phi = mFactorSequenceA.phi();
      mFactorSequenceA = Jaguar.factor(++mN);
      if (mFactorSequenceA.sigma().mod(phi).isZero()) {
        return Z.valueOf(mN - 1);
      }
    }
  }
}
