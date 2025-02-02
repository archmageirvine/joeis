package irvine.oeis.a069;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.a000.A000005;

/**
 * A069233 Numbers k such that there is exactly 1 prime p satisfying the inequality k &lt; p &lt; k + tau(k)^2 where tau(k) = A000005(k).
 * @author Sean A. Irvine
 */
public class A069233 extends A000005 {

  private final Fast mPrime = new Fast();

  @Override
  public Z next() {
    while (true) {
      final long t = super.next().longValueExact();
      long cnt = 0;
      for (long p = mPrime.nextPrime(mN); p < mN + t * t; p = mPrime.nextPrime(p)) {
        if (++cnt > 1) {
          break;
        }
      }
      if (cnt == 1) {
        return Z.valueOf(mN);
      }
    }
  }
}

