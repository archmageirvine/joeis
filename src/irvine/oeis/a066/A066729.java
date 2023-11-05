package irvine.oeis.a066;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066729 a(n) = Product_{d|n, d&lt;n} d if n is composite, n otherwise.
 * @author Sean A. Irvine
 */
public class A066729 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final FactorSequence fs = Jaguar.factor(++mN);
    if (fs.bigOmega() == 1) {
      return Z.valueOf(mN);
    }
    Z prod = Z.ONE;
    for (final Z dd : fs.divisors()) {
      prod = prod.multiply(dd);
    }
    return prod.divide(mN);
  }
}
