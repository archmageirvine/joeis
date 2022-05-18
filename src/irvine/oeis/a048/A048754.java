package irvine.oeis.a048;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A048754 Mean integral quotients associated with A048753.
 * @author Sean A. Irvine
 */
public class A048754 implements Sequence {

  private long mN = 3;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      final Z s0 = fs.sigma0();
      if (!Z.TWO.equals(s0)) { // i.e. mN is composite
        final Z[] qr = ZUtils.product(fs.divisors()).divide(mN).divideAndRemainder(s0.subtract(1));
        if (qr[1].isZero()) {
          return qr[0];
        }
      }
    }
  }
}
