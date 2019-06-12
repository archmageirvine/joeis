package irvine.oeis.a023;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.a018.A018252;

/**
 * A023883 Not a prime and average of divisors is an integer.
 * @author Sean A. Irvine
 */
public class A023883 extends A018252 {

  @Override
  public Z next() {
    while (true) {
      final Z n = super.next();
      final FactorSequence fs = Cheetah.factor(n);
      if (Z.ZERO.equals(fs.sigma().mod(fs.sigma0()))) {
        return n;
      }
    }
  }
}

