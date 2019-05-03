package irvine.oeis.a094;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A094338 (Sum of composites among next <code>n numbers)-(sum</code> of primes among next <code>n</code> numbers).
 * @author Sean A. Irvine
 */
public class A094338 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mN = 0;
  private long mStart = 2;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ZERO;
    }
    Z cSum = Z.ZERO;
    Z pSum = Z.ZERO;
    for (long k = 0; k < mN; ++k, ++mStart) {
      if (mPrime.isPrime(mStart)) {
        pSum = pSum.add(mStart);
      } else {
        cSum = cSum.add(mStart);
      }
    }
    return cSum.subtract(pSum);
  }
}

