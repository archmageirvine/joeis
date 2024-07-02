package irvine.oeis.a071;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A071127 Number of times there is a prime p &lt; n such that 2n+p is prime.
 * @author Sean A. Irvine
 */
public class A071127 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long cnt = 0;
    for (long p = 2; p < mN; p = mPrime.nextPrime(p)) {
      if (mPrime.isPrime(2 * mN + p)) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}
