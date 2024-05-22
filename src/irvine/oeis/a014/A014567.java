package irvine.oeis.a014;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A014567 Numbers k such that k and sigma(k) are relatively prime, where sigma(k) = sum of divisors of k (A000203).
 * @author Sean A. Irvine
 */
public class A014567 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (mN.gcd(Functions.SIGMA1.z(mN)).equals(Z.ONE)) {
        return mN;
      }
    }
  }
}
