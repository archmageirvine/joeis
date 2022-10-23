package irvine.oeis.a046;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A046999 Numbers k whose average divisor is nonintegral and divides k.
 * @author Sean A. Irvine
 */
public class A046999 extends Sequence1 {

  private long mN = 27;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      final Z sigma0 = fs.sigma0();
      final Z sigma1 = fs.sigma();
      if (!sigma1.mod(sigma0).isZero() && sigma0.multiply(mN).mod(sigma1).isZero()) {
        return Z.valueOf(mN);
      }
    }
  }
}
