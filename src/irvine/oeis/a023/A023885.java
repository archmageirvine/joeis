package irvine.oeis.a023;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.a002.A002808;

/**
 * A023885 Not a prime and average of divisors except itself is an integer.
 * @author Sean A. Irvine
 */
public class A023885 extends A002808 {

  @Override
  public Z next() {
    while (true) {
      final Z n = super.next();
      final FactorSequence fs = Cheetah.factor(n);
      if (fs.sigma().subtract(n).mod(fs.sigma0().subtract(1)).isZero()) {
        return n;
      }
    }
  }
}

