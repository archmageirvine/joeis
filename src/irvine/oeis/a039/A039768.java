package irvine.oeis.a039;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A039768 Numbers k such that gcd(phi(k), k-1) = number of divisors of (k-1).
 * @author Sean A. Irvine
 */
public class A039768 implements Sequence {

  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      if (Cheetah.factor(++mN).phi().gcd(Z.valueOf(mN - 1)).equals(Cheetah.factor(mN - 1).sigma0())) {
        return Z.valueOf(mN);
      }
    }
  }
}
