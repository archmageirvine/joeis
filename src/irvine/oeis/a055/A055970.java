package irvine.oeis.a055;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.a018.A018252;

/**
 * A055970 Nonprime numbers k such that k | sigma_3(k) + phi(k)^3.
 * @author Sean A. Irvine
 */
public class A055970 extends A018252 {

  @Override
  public Z next() {
    while (true) {
      final Z n = super.next();
      final FactorSequence fs = Cheetah.factor(n);
      if (fs.sigma(3).add(fs.phi().pow(3)).mod(n).isZero()) {
        return n;
      }
    }
  }
}
