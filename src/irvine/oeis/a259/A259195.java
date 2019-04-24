package irvine.oeis.a259;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A259195.
 * @author Sean A. Irvine
 */
public class A259195 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    long sum = 0;
    for (long l = 2; l <= mN / 5; l = mPrime.nextPrime(l)) {
      for (long k = l; k <= (mN - l) / 4; k = mPrime.nextPrime(k)) {
        for (long j = k; j <= (mN - k - l) / 3; j = mPrime.nextPrime(j)) {
          for (long i = j; i <= (mN - j - k - l) / 2; i = mPrime.nextPrime(i)) {
            if (mPrime.isPrime(mN - i - j - k - l)) {
              ++sum;
            }
          }
        }
      }
    }
    return Z.valueOf(sum);
  }
}
