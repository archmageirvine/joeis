package irvine.oeis.a068;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicBooleanArray;

/**
 * A068861 a(1) = 1; a(n+1) is the smallest number not already in the sequence which differs from a(n) at every digit.
 * @author Sean A. Irvine
 */
public class A068861 extends Sequence1 {

  private final LongDynamicBooleanArray mSeen = new LongDynamicBooleanArray();
  private long mN = 0;

  @Override
  public Z next() {
    long k = 0;
    while (true) {
      if (!mSeen.isSet(++k) && A068853.is(mN, k)) {
        mN = k;
        mSeen.set(mN);
        return Z.valueOf(mN);
      }
    }
  }
}
