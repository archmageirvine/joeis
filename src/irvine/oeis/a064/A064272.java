package irvine.oeis.a064;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A064272 Number of representations of n as the sum of a prime number and a nonzero square.
 * @author Sean A. Irvine
 */
public class A064272 extends Sequence2 {

  private final Fast mPrime = new Fast();
  private long mN = 1;

  @Override
  public Z next() {
    ++mN;
    long cnt = 0;
    long k = 0;
    long s;
    while ((s = ++k * k) < mN) {
      if (mPrime.isPrime(mN - s)) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}
