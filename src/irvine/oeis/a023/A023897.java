package irvine.oeis.a023;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A023897 sigma_1(n) / phi(n) for balanced numbers.
 * @author Sean A. Irvine
 */
public class A023897 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Cheetah.factor(++mN);
      final Z[] qr = fs.sigma().divideAndRemainder(fs.phi());
      if (qr[1].isZero()) {
        return qr[0];
      }
    }
  }
}

