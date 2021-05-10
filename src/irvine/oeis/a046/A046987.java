package irvine.oeis.a046;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A046987 Multiply perfect numbers whose average divisor is (a) not an integer and (b) does not divide the number itself.
 * @author Sean A. Irvine
 */
public class A046987 implements Sequence {

  private long mN = 119;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Cheetah.factor(++mN);
      final Z sigma0 = fs.sigma0();
      final Z sigma1 = fs.sigma();
      if (sigma1.mod(mN) == 0 && !sigma1.mod(sigma0).isZero() && !sigma0.multiply(mN).mod(sigma1).isZero()) {
        return Z.valueOf(mN);
      }
    }
  }
}
