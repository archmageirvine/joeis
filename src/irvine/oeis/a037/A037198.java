package irvine.oeis.a037;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A037198 Number of divisors of (sigma(n)-n) = number of divisors of n.
 * @author Sean A. Irvine
 */
public class A037198 implements Sequence {

  private long mN = 5;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Cheetah.factor(++mN);
      if (Cheetah.factor(fs.sigma().subtract(mN)).sigma0().equals(fs.sigma0())) {
        return Z.valueOf(mN);
      }
    }
  }
}
