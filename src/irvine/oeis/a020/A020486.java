package irvine.oeis.a020;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A020486 Average of squares of divisors is an integer: sigma_0(n) divides sigma_2(n).
 * @author Sean A. Irvine
 */
public class A020486 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      if (fs.sigma2().mod(fs.sigma0()).isZero()) {
        return Z.valueOf(mN);
      }
    }
  }
}
