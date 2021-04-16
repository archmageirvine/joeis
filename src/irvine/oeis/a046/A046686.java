package irvine.oeis.a046;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A046686 Numbers k such that k and sum of cubes of divisors of k are relatively prime.
 * @author Sean A. Irvine
 */
public class A046686 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final FactorSequence fs = Cheetah.factor(mN);
      if (Z.ONE.equals(fs.sigma(3).gcd(mN))) {
        return mN;
      }
    }
  }
}
