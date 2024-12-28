package irvine.oeis.a023;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A023897 a(n) = sigma_1(k) / phi(k) where k = A020492(n) is the n-th balanced number.
 * @author Sean A. Irvine
 */
public class A023897 extends Sequence1 {

  protected long mN = 0;

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

