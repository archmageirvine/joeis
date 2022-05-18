package irvine.oeis.a048;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A048968 Numbers k such that sigma(k) / d(k) is prime.
 * @author Sean A. Irvine
 */
public class A048968 implements Sequence {

  private long mN = 2;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      final Z[] qr = fs.sigma().divideAndRemainder(fs.sigma0());
      if (qr[1].isZero() && qr[0].isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
