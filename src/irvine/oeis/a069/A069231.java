package irvine.oeis.a069;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.a000.A000005;

/**
 * A069231 Numbers n such that there are exactly 3 primes p satisfying the inequality n &lt; p &lt; n + tau(n)^2 where tau(n) = A000005(n).
 * @author Sean A. Irvine
 */
public class A069231 extends A000005 {

  private final Fast mPrime = new Fast();

  @Override
  public Z next() {
    while (true) {
      final long t = super.next().longValueExact();
      long cnt = 0;
      for (long p = mPrime.nextPrime(mN); p < mN + t * t; p = mPrime.nextPrime(p)) {
        if (++cnt > 3) {
          break;
        }
      }
      if (cnt == 3) {
        return Z.valueOf(mN);
      }
    }
  }
}

