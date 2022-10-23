package irvine.oeis.a008;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A008470 At least 3 out of 10m+1, 10m+3, 10m+7, 10m+9 are primes.
 * @author Sean A. Irvine
 */
public class A008470 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  protected boolean accept(final int c) {
    return c >= 3;
  }

  @Override
  public Z next() {
    while (true) {
      ++mN;
      int c = 0;
      final long m = 10 * mN;
      if (mPrime.isPrime(m + 1)) {
        ++c;
      }
      if (mPrime.isPrime(m + 3)) {
        ++c;
      }
      if (mPrime.isPrime(m + 7)) {
        ++c;
      }
      if (mPrime.isPrime(m + 9)) {
        ++c;
      }
      if (accept(c)) {
        return Z.valueOf(mN);
      }
    }
  }
}
