package irvine.oeis.a046;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A046686 Numbers k such that k and sum of cubes of divisors of k are relatively prime.
 * @author Sean A. Irvine
 */
public class A046686 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final FactorSequence fs = Jaguar.factor(mN);
      if (Z.ONE.equals(fs.sigma(3).gcd(mN))) {
        return mN;
      }
    }
  }
}
