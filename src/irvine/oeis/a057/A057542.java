package irvine.oeis.a057;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a000.A000108;
import irvine.oeis.a038.A038776;
import irvine.util.array.LongDynamicBooleanArray;

/**
 * A057542 Maximum cycle length in each permutation between A038776[1] and A038776[A000108[n]].
 * @author Sean A. Irvine
 */
public class A057542 extends A000108 {

  private final MemorySequence mA = MemorySequence.cachedSequence(new PrependSequence(new A038776(), 0));
  private final LongDynamicBooleanArray mSeen = new LongDynamicBooleanArray();
  private int mN = 0;
  private int mLongest = 1;

  @Override
  public Z next() {
    final int lim = super.next().intValueExact();
    while (++mN < lim) {
      if (!mSeen.isSet(mN)) {
        int m = mN;
        mSeen.set(m);
        int cnt = 0;
        do {
          m = mA.a(m).intValueExact();
          mSeen.set(m);
          ++cnt;
        } while (m != mN);
        if (cnt > mLongest) {
          mLongest = cnt;
        }
      }
    }
    return Z.valueOf(mLongest);
  }
}
