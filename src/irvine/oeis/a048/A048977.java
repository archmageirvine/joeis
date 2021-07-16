package irvine.oeis.a048;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.a002.A002808;

/**
 * A048977 Primes arising in A048969.
 * @author Sean A. Irvine
 */
public class A048977 extends A002808 {

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Cheetah.factor(super.next());
      final Z[] qr = fs.sigma().divideAndRemainder(fs.sigma0());
      if (qr[1].isZero() && qr[0].isProbablePrime()) {
        return qr[0];
      }
    }
  }
}
