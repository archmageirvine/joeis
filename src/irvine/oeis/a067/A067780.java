package irvine.oeis.a067;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067780 Numbers n such that sigma(n)/phi(n) is prime.
 * @author Sean A. Irvine
 */
public class A067780 extends Sequence1 {

  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      final Z[] qr = fs.sigma().divideAndRemainder(fs.phi());
      if (qr[1].isZero() && qr[0].isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
