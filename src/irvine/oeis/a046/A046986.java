package irvine.oeis.a046;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A046986 Multiply perfect numbers whose average divisor divides the number but is not an integer.
 * @author Sean A. Irvine
 */
public class A046986 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Cheetah.factor(++mN);
      final Z sigma0 = fs.sigma0();
      final Z sigma1 = fs.sigma();
      if (sigma1.mod(mN) == 0 && !sigma1.mod(sigma0).isZero() && sigma0.multiply(mN).mod(sigma1).isZero()) {
        return Z.valueOf(mN);
      }
    }
  }
}
