package irvine.oeis.a048;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A048751 Composites k whose product of divisors divided by number of divisors is an integer.
 * @author Sean A. Irvine
 */
public class A048751 implements Sequence {

  private long mN = 5;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Cheetah.factor(++mN);
      final Z s0 = fs.sigma0();
      if (!Z.TWO.equals(s0)) { // i.e. mN is composite
        final Z[] qr = ZUtils.product(fs.divisors()).divideAndRemainder(s0);
        if (qr[1].isZero()) {
          return Z.valueOf(mN);
        }
      }
    }
  }
}
