package irvine.oeis.a037;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A037197 Number of divisors of sigma(n) = number of divisors of n.
 * @author Sean A. Irvine
 */
public class A037197 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Cheetah.factor(++mN);
      if (Cheetah.factor(fs.sigma()).sigma0().equals(fs.sigma0())) {
        return Z.valueOf(mN);
      }
    }
  }
}
