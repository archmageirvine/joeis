package irvine.oeis.a064;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.a000.A000720;

/**
 * A064445 Numbers k such that sopf(k) - pi(k) = tau(k).
 * @author Sean A. Irvine
 */
public class A064445 extends A000720 {

  @Override
  public Z next() {
    while (true) {
      final Z pi = super.next();
      final FactorSequence fs = Jaguar.factor(mN);
      if (pi.equals(fs.sopf().subtract(fs.sigma0()))) {
        return mN;
      }
    }
  }
}
