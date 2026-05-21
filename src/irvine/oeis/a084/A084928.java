package irvine.oeis.a084;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A084928 If the numbers 1 to n^3 are arranged in a cubic array, a(n) is the minimum number of primes in each row of the n^2 rows in the "east-west view" that can have primes.
 * @author Sean A. Irvine
 */
public class A084928 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ZERO;
    }
    long min = mN;
    for (long c = 1; c <= mN * mN; ++c) {
      int cnt = 0;
      for (long r = 1; r <= mN; ++r) {
        if (mPrime.isPrime(r + (c - 1) * mN)) {
          ++cnt;
        }
      }
      if (cnt < min) {
        min = cnt;
      }
    }
    return Z.valueOf(min);
  }
}
