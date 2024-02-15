package irvine.oeis.a068;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A068422 Numbers n such that n-phi(n) divides sigma(n).
 * @author Sean A. Irvine
 */
public class A068422 extends Sequence1 {

  private Z mN = Z.ONE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final FactorSequence fs = Jaguar.factor(mN);
      if (fs.sigma().mod(mN.subtract(fs.phi())).isZero()) {
        return mN;
      }
    }
  }
}

