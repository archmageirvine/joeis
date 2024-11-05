package irvine.oeis.a072;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.a018.A018252;

/**
 * A072910 a(n) = sigma(A023883(n)) / tau(A023883(n)).
 * @author Sean A. Irvine
 */
public class A072910 extends A018252 {

  @Override
  public Z next() {
    while (true) {
      final Z n = super.next();
      final FactorSequence fs = Jaguar.factor(n);
      final Z[] qr = fs.sigma().divideAndRemainder(fs.sigma0());
      if (qr[1].isZero()) {
        return qr[0];
      }
    }
  }
}

