package irvine.oeis.a077;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A077766 Number of primes of form 4k+1 between n^2 and (n+1)^2.
 * @author Sean A. Irvine
 */
public class A077766 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long cnt = 0;
    for (long p = mPrime.nextPrime(mN * mN); p < (mN + 1) * (mN + 1); p = mPrime.nextPrime(p)) {
      if ((p & 3) == 1) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}

