package irvine.oeis.a033;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A033631 Numbers k such that sigma(phi(k)) = sigma(k) where sigma is the sum of divisors function A000203 and phi is the Euler totient function A000010.
 * @author Sean A. Irvine
 */
public class A033631 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Cheetah.factor(++mN);
      final Z sigma = fs.sigma();
      final Z phi = fs.phi();
      if (Cheetah.factor(phi).sigma().equals(sigma)) {
        return Z.valueOf(mN);
      }
    }
  }
}
