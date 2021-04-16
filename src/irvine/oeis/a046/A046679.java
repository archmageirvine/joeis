package irvine.oeis.a046;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A046679 Numbers n such that number of divisors of n and sum of squares of divisors of n are relatively prime.
 * @author Sean A. Irvine
 */
public class A046679 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Cheetah.factor(++mN);
      if (Z.ONE.equals(fs.sigma0().gcd(fs.sigma2()))) {
        return Z.valueOf(mN);
      }
    }
  }
}
