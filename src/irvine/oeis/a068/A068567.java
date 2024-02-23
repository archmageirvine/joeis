package irvine.oeis.a068;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A068567 Numbers k such that gpf(k) &lt; k/gpf(k) and gpf(k/gpf(k)) &lt; gpf(k), where gpf(n) is the greatest prime factor of n, A006530.
 * @author Sean A. Irvine
 */
public class A068567 extends Sequence1 {

  private long mN = 11;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      final Z gpf = fs.largestPrimeFactor();
      if (fs.getExponent(gpf) == 1) {
        final long g = gpf.longValue();
        if (g < mN / g) {
          return Z.valueOf(mN);
        }
      }
    }
  }
}
