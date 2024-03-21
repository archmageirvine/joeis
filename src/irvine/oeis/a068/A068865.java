package irvine.oeis.a068;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicBooleanArray;

/**
 * A068865 a(1) = 1; a(n) is the smallest triangular number not already in the sequence which differs from a(n-1) at every digit.
 * @author Sean A. Irvine
 */
public class A068865 extends Sequence1 {

  private final LongDynamicBooleanArray mSeen = new LongDynamicBooleanArray();
  private long mN = 0;

  @Override
  public Z next() {
    long k = 0;
    while (true) {
      if (!mSeen.isSet(++k) && A068853.is(mN, k * (k + 1) / 2)) {
        mSeen.set(k);
        mN = k * (k + 1) / 2;
        return Z.valueOf(mN);
      }
    }
  }
}
