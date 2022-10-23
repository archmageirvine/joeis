package irvine.oeis.a054;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A054845 Number of ways of representing n as the sum of one or more consecutive primes.
 * @author Sean A. Irvine
 */
public class A054845 extends Sequence0 {

  private final Fast mPrime = new Fast();
  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    long cnt = 0;
    long sum = 0;
    for (long p = 2, q = 2; p <= mN; p = mPrime.nextPrime(p)) {
      sum += p;
      while (sum > mN) {
        sum -= q;
        q = mPrime.nextPrime(q);
      }
      if (sum == mN) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}
