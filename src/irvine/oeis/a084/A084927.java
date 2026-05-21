package irvine.oeis.a084;

import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A084927 If the numbers 1 to n^3 are arranged in a cubic array, a(n) is the minimum number of primes in each column of the n^2 columns in the "top view" that can have primes.
 * @author Sean A. Irvine
 */
public class A084927 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ZERO;
    }
    long min = mN;
    for (long c = 1; c <= mN * mN; ++c) {
      if (Functions.GCD.l(c, mN) == 1) {
        int cnt = 0;
        for (long r = 1; r <= mN; ++r) {
          if (mPrime.isPrime(c + (r - 1) * mN * mN)) {
            ++cnt;
          }
        }
        if (cnt < min) {
          min = cnt;
        }
      }
    }
    return Z.valueOf(min);
  }
}
