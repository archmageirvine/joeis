package irvine.oeis.a002;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002126 Number of solutions to n=p+q where p and q are primes or zero.
 * @author Sean A. Irvine
 */
public class A002126 implements Sequence {

  private long mN = -1;
  private final Fast mPrime = new Fast();

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    long s = mPrime.isPrime(mN) ? 2 : 0;
    for (long k = 2; k < mN; k = mPrime.nextPrime(k)) {
      if (mPrime.isPrime(mN - k)) {
        ++s;
      }
    }
    return Z.valueOf(s);
  }
}
