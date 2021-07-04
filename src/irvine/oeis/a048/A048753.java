package irvine.oeis.a048;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A048753 Composite numbers k whose product of aliquot divisors divided by number of aliquot divisors is an integer.
 * @author Sean A. Irvine
 */
public class A048753 implements Sequence {

  private long mN = 3;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Cheetah.factor(++mN);
      final Z s0 = fs.sigma0();
      if (!Z.TWO.equals(s0)) { // i.e. mN is composite
        final Z[] qr = ZUtils.product(fs.divisors()).divide(mN).divideAndRemainder(s0.subtract(1));
        if (qr[1].isZero()) {
          return Z.valueOf(mN);
        }
      }
    }
  }
}
