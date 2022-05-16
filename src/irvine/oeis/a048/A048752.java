package irvine.oeis.a048;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A048752 Mean integral divisors associated with A048751.
 * @author Sean A. Irvine
 */
public class A048752 implements Sequence {

  private long mN = 5;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      final Z s0 = fs.sigma0();
      if (!Z.TWO.equals(s0)) { // i.e. mN is composite
        final Z[] qr = ZUtils.product(fs.divisors()).divideAndRemainder(s0);
        if (qr[1].isZero()) {
          return qr[0];
        }
      }
    }
  }
}
