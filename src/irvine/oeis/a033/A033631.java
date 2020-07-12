package irvine.oeis.a033;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A033631 Numbers k such that <code>sigma(phi(k)) = sigma(k)</code> where sigma is the sum of divisors function <code>A000203</code> and phi is the Euler totient function <code>A000010</code>.
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
