package irvine.oeis.a054;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A054022 Chowla function of n is divisible by the number of divisors of n.
 * @author Sean A. Irvine
 */
public class A054022 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Cheetah.factor(++mN);
      if (fs.sigma().subtract(mN + 1).mod(fs.sigma0()).isZero()) {
        return Z.valueOf(mN);
      }
    }
  }
}

