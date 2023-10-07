package irvine.oeis.a066;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066218 Numbers k such that sigma(k) = Sum_{j|k, j&lt;k} sigma(j).
 * @author Sean A. Irvine
 */
public class A066218 extends Sequence1 {

  private long mN = 197;

  private boolean is(final long n) {
    final FactorSequence fs = Jaguar.factor(n);
    Z sigma = fs.sigma();
    for (final Z d : fs.divisors()) {
      if (d.longValue() != n) {
        sigma = sigma.subtract(Jaguar.factor(d).sigma());
        if (sigma.signum() < 0) {
          return false;
        }
      }
    }
    return sigma.isZero();
  }

  @Override
  public Z next() {
    while (true) {
      if (is(++mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
