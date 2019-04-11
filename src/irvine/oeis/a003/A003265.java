package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.a000.A000073;
import irvine.util.array.LongDynamicBooleanArray;

/**
 * A003265 Not representable by truncated tribonacci sequence <code>2, 4, 7, 13, 24, 44, 81, ...</code>.
 * @author Sean A. Irvine
 */
public class A003265 extends A000073 {

  private final LongDynamicBooleanArray mSeen = new LongDynamicBooleanArray();
  {
    mSeen.set(0);
  }
  private long mTribonacci = -1;
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (mN >= mTribonacci) {
        do {
          mTribonacci = super.next().longValueExact();
        } while (mTribonacci <= 1);
        for (long k = mSeen.length() - 1, j = k + mTribonacci; k >= 0; --k, --j) {
          if (mSeen.isSet(k)) {
            mSeen.set(j);
          }
        }
      }
      if (!mSeen.isSet(mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}

