package irvine.oeis.a062;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A062804 phi(n) - floor(n^(1/3))*tau(n) = 0.
 * @author Sean A. Irvine
 */
public class A062804 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      if (fs.phi().subtract(Z.valueOf(mN).root(3).multiply(fs.sigma0())).isZero()) {
        return Z.valueOf(mN);
      }
    }
  }
}
