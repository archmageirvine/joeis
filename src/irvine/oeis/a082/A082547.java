package irvine.oeis.a082;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicBooleanArray;

/**
 * A082547 Number of primes p such that p can be expressed as the sum of distinct primes with largest prime in the sum = n-th prime.
 * @author Sean A. Irvine
 */
public class A082547 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private final LongDynamicBooleanArray mV = new LongDynamicBooleanArray();
  private long mP = 1;
  private long mPrimeSum = 0;

  @Override
  public Z next() {
    mP = mPrime.nextPrime(mP);
    long count = 1;
    for (long i = mPrimeSum; i >= 1; --i) {
      if (mV.isSet(i)) {
        if (mPrime.isPrime(i + mP)) {
          ++count;
        }
        mV.set(i + mP);
      }
    }
    mV.set(mP);
    mPrimeSum += mP;
    return Z.valueOf(count);
  }
}
