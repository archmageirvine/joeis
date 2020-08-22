package irvine.oeis.a023;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.a002.A002808;

/**
 * A023886 Average of proper divisors (excluding 1) is an integer.
 * @author Sean A. Irvine
 */
public class A023886 extends A002808 {

  @Override
  public Z next() {
    while (true) {
      final Z n = super.next();
      final FactorSequence fs = Cheetah.factor(n);
      if (Z.ZERO.equals(fs.sigma().subtract(n).subtract(1).mod(fs.sigma0().subtract(2)))) {
        return n;
      }
    }
  }
}

