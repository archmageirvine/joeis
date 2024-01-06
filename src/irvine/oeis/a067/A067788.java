package irvine.oeis.a067;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.a000.A000720;

/**
 * A067788 Numbers n such that sigma(n) - phi(n) = pi(n).
 * @author Sean A. Irvine
 */
public class A067788 extends A000720 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      if (fs.sigma().subtract(fs.phi()).equals(super.next())) {
        return Z.valueOf(mN);
      }
    }
  }
}
