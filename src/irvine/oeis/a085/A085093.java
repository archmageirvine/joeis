package irvine.oeis.a085;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicBooleanArray;

/**
 * A085093 Distinct primes and composite numbers alternately such that the sum of a pair of successive terms is prime or composite alternately.
 * @author Sean A. Irvine
 */
public class A085093 extends Sequence1 {

  private final LongDynamicBooleanArray mUsed = new LongDynamicBooleanArray();
  private long mA = 0;
  private long mLeastUnsed = 3;
  private boolean mPrime = false;

  @Override
  public Z next() {
    if (mA == 0) {
      mA = 2;
      return Z.TWO;
    }
    mPrime = !mPrime;
    while (mUsed.isSet(mLeastUnsed) || (mLeastUnsed > 9 && (mLeastUnsed & 1) == 1 && !Predicates.PRIME.is(mLeastUnsed))) {
      ++mLeastUnsed;
    }
    long k = mLeastUnsed;
    while (true) {
      if (!mUsed.isSet(k) && Predicates.PRIME.is(k) != mPrime && Predicates.PRIME.is(mA + k) == mPrime) {
        mA = k;
        mUsed.set(k);
        return Z.valueOf(k);
      }
      ++k;
    }
  }
}

