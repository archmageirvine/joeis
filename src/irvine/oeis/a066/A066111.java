package irvine.oeis.a066;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.a000.A000961;

/**
 * A066111 Prime powers m such that sigma_4(m^2)/sigma_2(m^2) is prime.
 * @author Sean A. Irvine
 */
public class A066111 extends A000961 {

  @Override
  public Z next() {
    while (true) {
      final Z pp = super.next();
      final FactorSequence fs = Jaguar.factor(pp).square();
      final Z s4 = fs.sigma(4);
      final Z s2 = fs.sigma2();
      final Z[] qr = s4.divideAndRemainder(s2);
      if (qr[1].isZero() && qr[0].isProbablePrime()) {
        return pp;
      }
    }
  }
}
