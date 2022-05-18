package irvine.oeis.a046;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A046684 Numbers k such that k and sum of squares of divisors of k are relatively prime.
 * @author Sean A. Irvine
 */
public class A046684 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final FactorSequence fs = Jaguar.factor(mN);
      if (Z.ONE.equals(fs.sigma2().gcd(mN))) {
        return mN;
      }
    }
  }
}
