package irvine.oeis.a084;

import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A084929 If the numbers 1 to n^3 are arranged in a cubic array, a(n) is the minimum number of primes in each column of the n^2 columns in the "north-south view" that can have primes.
 * @author Sean A. Irvine
 */
public class A084929 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ZERO;
    }
    long min = mN;
    for (long a = 1; a <= mN; ++a) {
      for (long b = 1; b <= mN; ++b) {
        final long c = a + (b - 1) * mN * mN;
        if (Functions.GCD.l(c, mN) == 1) {
          int cnt = 0;
          for (long r = 1; r <= mN; ++r) {
            if (mPrime.isPrime(c + (r - 1) * mN)) {
              ++cnt;
            }
          }
          if (cnt < min) {
            min = cnt;
          }
        }
      }
    }
    return Z.valueOf(min);
  }
}
