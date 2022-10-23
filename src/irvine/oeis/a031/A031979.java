package irvine.oeis.a031;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A031979 Smallest digit of n concatenated with largest digit of n is prime.
 * @author Sean A. Irvine
 */
public class A031979 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 10;

  private long smallestBiggest(long n) {
    long min = 9;
    long max = 0;
    while (n != 0) {
      final long r = n % 10;
      n /= 10;
      if (r > max) {
        max = r;
      }
      if (r < min) {
        min = r;
      }
    }
    return min * 10 + max;
  }

  @Override
  public Z next() {
    while (true) {
      if (mPrime.isPrime(smallestBiggest(++mN))) {
        return Z.valueOf(mN);
      }
    }
  }
}
