package irvine.oeis.a073;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicBooleanArray;

/**
 * A073158 a() = 1,2,4,7,... [ A073158 ], adjacent sums = 3,6,11... [ A073159 ] and 2nd adjacent sums = 9,17,... [ A073160 ] are disjoint but not monotonic; adjoin next free number to A073158 to construct three sequences that together include all positive integers.
 * @author Sean A. Irvine
 */
public class A073158 extends Sequence1 {

  private final LongDynamicBooleanArray mUsed = new LongDynamicBooleanArray();
  private long mA = 0;
  private long mB = 0;

  protected long select(final long a, final long b, final long c) {
    return a;
  }

  @Override
  public Z next() {
    final long alpha = mA;
    final long beta = mB;
    mA = 0;
    while (true) {
      if (!mUsed.isSet(++mA) && !mUsed.isSet(mA + alpha) && !mUsed.isSet(mA + alpha + beta)) {
        if (alpha != 0) {
          mB = mA + alpha;
          if (beta != 0) {
            mUsed.set(beta + mB);
          }
        }
        mUsed.set(mA);
        mUsed.set(mB);
        return Z.valueOf(select(mA, mB, beta + mB));
      }
    }
  }
}
