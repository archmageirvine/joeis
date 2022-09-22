package irvine.oeis.a059;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A059396 Number of primes less than square root of n-th prime; i.e., number of trial divisions by smaller primes to show that n-th prime is indeed prime.
 * @author Sean A. Irvine
 */
public class A059396 extends A000040 {

  private Z mQ = Z.TWO;
  private Z mCount = Z.ZERO;

  @Override
  public Z next() {
    final Z p = super.next();
    while (mQ.square().compareTo(p) < 0) {
      mCount = mCount.add(1);
      mQ = mPrime.nextPrime(mQ);
    }
    return mCount;
  }
}
