package irvine.oeis.a014;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A014567 Numbers n such that n and sigma(n) are relatively prime, where sigma(n) = sum of divisors of n, A000203.
 * @author Sean A. Irvine
 */
public class A014567 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (mN.gcd(Cheetah.factor(mN).sigma()).equals(Z.ONE)) {
        return mN;
      }
    }
  }
}
