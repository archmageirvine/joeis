package irvine.oeis.a067;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.a002.A002808;

/**
 * A067192 Composite c such that sigma(c)==2 (mod phi(c)).
 * @author Sean A. Irvine
 */
public class A067192 extends A002808 {

  @Override
  public Z next() {
    while (true) {
      final Z c = super.next();
      final FactorSequence fs = Jaguar.factor(c);
      if (fs.sigma().mod(fs.phi()).equals(Z.TWO)) {
        return c;
      }
    }
  }
}

