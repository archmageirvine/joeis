package irvine.oeis.a067;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.a002.A002808;

/**
 * A067252 Composite k such that sigma(k)-phi(k) is prime.
 * @author Sean A. Irvine
 */
public class A067252 extends A002808 {

  @Override
  public Z next() {
    while (true) {
      final Z c = super.next();
      final FactorSequence fs = Jaguar.factor(c);
      if (fs.sigma().subtract(fs.phi()).isProbablePrime()) {
        return c;
      }
    }
  }
}

