package irvine.oeis.a083;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A083382 Write the numbers from 1 to n^2 consecutively in n rows of length n; a(n) = minimal number of primes in a row.
 * @author Sean A. Irvine
 */
public class A083382 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ZERO;
    }
    long min = Long.MAX_VALUE;
    long p = 1;
    long k = mN;
    long cnt = 0;
    while (p < mN * mN) {
      p = mPrime.nextPrime(p);
      if (p <= k) {
        ++cnt;
      } else {
        min = Math.min(min, cnt);
        k += mN;
        if (p > k && p < mN * mN) {
          return Z.ZERO; // Conjectured to never happen
        }
        cnt = 1;
      }
    }
    return Z.valueOf(min);
  }
}
