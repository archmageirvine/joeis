package irvine.oeis.a023;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A023897 sigma_1(n) / phi(n) for balanced numbers.
 * @author Sean A. Irvine
 */
public class A023897 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      final Z[] qr = fs.sigma().divideAndRemainder(fs.phi());
      if (qr[1].isZero()) {
        return qr[0];
      }
    }
  }
}

