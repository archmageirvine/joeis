package irvine.oeis.a068;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicBooleanArray;

/**
 * A068853.
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
