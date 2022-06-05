package irvine.oeis.a057;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A057368 Number of Gaussian primes (in the first half-quadrant; i.e., 0 to 45 degrees) with real part = n.
 * @author Sean A. Irvine
 */
public class A057368 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mN = 1;

  @Override
  public Z next() {
    long count = 0;
    if ((mN & 3) == 3 && mPrime.isPrime(mN)) {
      ++count;
    }
    final long n2 = mN * mN;
    for (long m = 1; m <= mN; ++m) {
      if (mPrime.isPrime(n2 + m * m)) {
        ++count;
      }
    }
    ++mN;
    return Z.valueOf(count);
  }
}
