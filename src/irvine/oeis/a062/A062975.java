package irvine.oeis.a062;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence3;

/**
 * A062975 Half-totient function of n is not divisible by the number of divisors of n.
 * @author Sean A. Irvine
 */
public class A062975 extends Sequence3 {

  private long mN = 2;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      if (fs.phi().divide2().mod(fs.sigma0AsLong()) != 0) {
        return Z.valueOf(mN);
      }
    }
  }
}

