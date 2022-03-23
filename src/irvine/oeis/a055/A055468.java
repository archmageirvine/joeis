package irvine.oeis.a055;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.a002.A002808;

/**
 * A055468 Composite numbers for which Sum of EulerPhi and Divisor-Sum is an integer multiple of the 4th power of the number of divisors.
 * @author Sean A. Irvine
 */
public class A055468 extends A002808 {

  @Override
  public Z next() {
    while (true) {
      final Z n = super.next();
      final FactorSequence fs = Cheetah.factor(n);
      if (fs.phi().add(fs.sigma()).mod(fs.sigma0().pow(4)).isZero()) {
        return n;
      }
    }
  }
}
