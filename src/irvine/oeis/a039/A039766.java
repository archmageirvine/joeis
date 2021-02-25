package irvine.oeis.a039;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A039766 Numbers k such that gcd(phi(k), k-1) = number of divisors of k.
 * @author Sean A. Irvine
 */
public class A039766 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Cheetah.factor(++mN);
      if (fs.phi().gcd(Z.valueOf(mN - 1)).equals(fs.sigma0())) {
        return Z.valueOf(mN);
      }
    }
  }
}
