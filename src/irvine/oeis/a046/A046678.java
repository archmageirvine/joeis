package irvine.oeis.a046;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A046678 Number of divisors of n and sum of divisors of n are relatively prime.
 * @author Sean A. Irvine
 */
public class A046678 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Cheetah.factor(++mN);
      if (Z.ONE.equals(fs.sigma().gcd(fs.sigma0()))) {
        return Z.valueOf(mN);
      }
    }
  }
}
