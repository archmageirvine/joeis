package irvine.oeis.a046;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A046680 Numbers k such that the number of divisors of k and sum of cubes of divisors of k are relatively prime.
 * @author Sean A. Irvine
 */
public class A046680 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Cheetah.factor(++mN);
      if (Z.ONE.equals(fs.sigma0().gcd(fs.sigma(3)))) {
        return Z.valueOf(mN);
      }
    }
  }
}
