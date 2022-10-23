package irvine.oeis.a015;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A015814 Numbers k such that phi(k + 1) divides sigma(k).
 * @author Sean A. Irvine
 */
public class A015814 extends Sequence1 {

  private FactorSequence mFactorSequenceA = Jaguar.factor(1);
  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      final Z sigma = mFactorSequenceA.sigma();
      mFactorSequenceA = Jaguar.factor(++mN);
      if (sigma.mod(mFactorSequenceA.phi()).isZero()) {
        return Z.valueOf(mN - 1);
      }
    }
  }
}
