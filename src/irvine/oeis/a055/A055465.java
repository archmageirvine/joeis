package irvine.oeis.a055;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.a002.A002808;

/**
 * A055465 Composite numbers for which sum of EulerPhi and Divisor-Sum is an integer multiple of the number of divisors.
 * @author Sean A. Irvine
 */
public class A055465 extends A002808 {

  @Override
  public Z next() {
    while (true) {
      final Z n = super.next();
      final FactorSequence fs = Jaguar.factor(n);
      if (fs.phi().add(fs.sigma()).mod(fs.sigma0()).isZero()) {
        return n;
      }
    }
  }
}
