package irvine.oeis.a046;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A046659 Numbers whose sum of divisors and sum of cubes of divisors are relatively prime.
 * @author Sean A. Irvine
 */
public class A046659 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Cheetah.factor(++mN);
      if (Z.ONE.equals(fs.sigma(3).gcd(fs.sigma()))) {
        return Z.valueOf(mN);
      }
    }
  }
}
