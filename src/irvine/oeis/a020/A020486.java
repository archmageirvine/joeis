package irvine.oeis.a020;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A020486 Average of squares of divisors is an integer: <code>sigma_0(n)</code> divides <code>sigma_2(n)</code>.
 * @author Sean A. Irvine
 */
public class A020486 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Cheetah.factor(++mN);
      if (Z.ZERO.equals(fs.sigma2().mod(fs.sigma0()))) {
        return Z.valueOf(mN);
      }
    }
  }
}
