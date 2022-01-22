package irvine.oeis.a054;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A054020 Chowla's function of n is not divisible by the number of proper divisors of n.
 * @author Sean A. Irvine
 */
public class A054020 implements Sequence {

  private long mN = 5;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Cheetah.factor(++mN);
      if (!fs.sigma().subtract(mN + 1).mod(fs.sigma0().subtract(1)).isZero()) {
        return Z.valueOf(mN);
      }
    }
  }
}

