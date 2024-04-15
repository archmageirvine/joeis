package irvine.oeis.a067;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067236 Numbers n such that gcd(sigma(n), sigma(sigma(n)))=1.
 * @author Georg Fischer
 */
public class A067236 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final Z sign = Functions.SIGMA.z(mN);
      if (sign.gcd(Functions.SIGMA.z(sign)).equals(Z.ONE)) {
        return Z.valueOf(mN);
      }
    }
  }
}
