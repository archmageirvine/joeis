package irvine.oeis.a068;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicBooleanArray;

/**
 * A068853.
 * @author Sean A. Irvine
 */
public class A068864 extends Sequence1 {

  private final LongDynamicBooleanArray mSeen = new LongDynamicBooleanArray();
  private long mN = 0;

  @Override
  public Z next() {
    long k = 0;
    while (true) {
      if (!mSeen.isSet(++k) && A068853.is(mN, k * k)) {
        mSeen.set(k);
        mN = k * k;
        return Z.valueOf(mN);
      }
    }
  }
}
