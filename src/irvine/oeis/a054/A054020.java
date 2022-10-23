package irvine.oeis.a054;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A054020 Chowla's function of n is not divisible by the number of proper divisors of n.
 * @author Sean A. Irvine
 */
public class A054020 extends Sequence1 {

  private long mN = 5;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      if (!fs.sigma().subtract(mN + 1).mod(fs.sigma0().subtract(1)).isZero()) {
        return Z.valueOf(mN);
      }
    }
  }
}

