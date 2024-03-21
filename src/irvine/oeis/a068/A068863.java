package irvine.oeis.a068;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicBooleanArray;

/**
 * A068863 a(1) = 2; a(n+1) is the smallest prime not already in the sequence which differs from a(n) at every digit.
 * @author Sean A. Irvine
 */
public class A068863 extends Sequence1 {

  private final LongDynamicBooleanArray mSeen = new LongDynamicBooleanArray();
  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    long p = 1;
    while (true) {
      p = mPrime.nextPrime(p);
      if (!mSeen.isSet(p) && A068853.is(mN, p)) {
        mN = p;
        mSeen.set(mN);
        return Z.valueOf(mN);
      }
    }
  }
}
