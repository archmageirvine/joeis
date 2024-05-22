package irvine.oeis.a048;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A048753 Composite numbers k whose product of aliquot divisors divided by number of aliquot divisors is an integer.
 * @author Sean A. Irvine
 */
public class A048753 extends Sequence1 {

  private long mN = 3;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      final Z s0 = fs.sigma0();
      if (!Z.TWO.equals(s0)) { // i.e. mN is composite
        final Z[] qr = Functions.PRODUCT.z(fs.divisors()).divide(mN).divideAndRemainder(s0.subtract(1));
        if (qr[1].isZero()) {
          return Z.valueOf(mN);
        }
      }
    }
  }
}
