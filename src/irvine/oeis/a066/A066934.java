package irvine.oeis.a066;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.a002.A002808;

/**
 * A066838.
 * @author Sean A. Irvine
 */
public class A066934 extends A002808 {

  @Override
  public Z next() {
    while (true) {
      final Z c = super.next();
      final FactorSequence fs = Jaguar.factor(c);
      if (fs.phi().mod(fs.bigOmega()) == 1) {
        return c;
      }
    }
  }
}
