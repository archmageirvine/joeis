package irvine.oeis.a070;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.a018.A018252;

/**
 * A070037 Nonprime numbers k such that sigma(k) == k+1 (mod phi(k)).
 * @author Sean A. Irvine
 */
public class A070037 extends A018252 {

  @Override
  public Z next() {
    while (true) {
      final Z c = super.next();
      final FactorSequence fs = Jaguar.factor(c);
      if (fs.sigma().subtract(c).subtract(1).mod(fs.phi()).isZero()) {
        return c;
      }
    }
  }
}
