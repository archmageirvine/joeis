package irvine.oeis.a014;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A014567 Numbers k such that k and <code>sigma(k)</code> are relatively prime, where <code>sigma(k) =</code> sum of divisors of k <code>(A000203)</code>.
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
