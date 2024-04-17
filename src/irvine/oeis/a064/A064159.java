package irvine.oeis.a064;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a062.A062298;

/**
 * A064159 Numbers n such that g(n) + sopfr(n) = n, where g(n)= number of nonprimes &lt;=n (A062298) and sopfr(n) = sum of primes dividing n with repetition (A001414).
 * @author Sean A. Irvine
 */
public class A064159 extends A062298 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (super.next().add(Functions.SOPFR.z(mN)).equals(mN)) {
        return mN;
      }
    }
  }
}
