package irvine.oeis.a062;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A062309 Number of ways writing n! as sums of a prime and a nonprime numbers.
 * @author Sean A. Irvine
 */
public class A062309 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mF = 1;
  private long mN = 0;

  @Override
  public Z next() {
    if (++mN > 20) {
      throw new UnsupportedOperationException();
    }
    mF *= mN;
    long cnt = 0;
    for (long p = 2; p < mF; p = mPrime.nextPrime(p)) {
      if (!mPrime.isPrime(mF - p)) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}

