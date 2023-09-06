package irvine.oeis.a065;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A065577 Number of Goldbach partitions of 10^n.
 * @author Sean A. Irvine
 */
public class A065577 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 1;

  @Override
  public Z next() {
    mN *= 10;
    long cnt = 0;
    for (long p = 3; 2 * p <= mN; p = mPrime.nextPrime(p)) {
      if (mPrime.isPrime(mN - p)) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}
