package irvine.oeis.a000;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicBooleanArray;

/**
 * A000398 Numbers of form x^2 + 2y^2 + 2yz + 4z^2.
 * @author Sean A. Irvine
 */
public class A000398 extends Sequence1 {

  private final LongDynamicBooleanArray mSeq = new LongDynamicBooleanArray();
  private long mLast = -1;
  private long mDone = -1;

  private void update(final long n) {
    // Form: x^2 + 2y^2 + 2yz + 4z^2
    if (n > mDone) {
      // Double the current size to give ourselves some head room
      // This could in theory be made more efficient by only computing
      // additional entries
      mDone = Math.max(mDone * 2, n);
      final long limit = LongUtils.sqrt(mDone);
      for (long x = 0; x <= limit; ++x) {
        final long xx = x * x;
        for (long y = -limit; y <= limit; ++y) {
          final long yy = xx + 2 * y * y;
          for (long z = -limit; z <= limit; ++z) {
            final long v = yy + 2 * y * z + 4 * z * z;
            if (v >= 0) {
              mSeq.set(v);
            }
          }
        }
      }
    }
  }

  @Override
  public Z next() {
    while (true) {
      update(++mLast);
      if (mSeq.isSet(mLast)) {
        return Z.valueOf(mLast);
      }
    }
  }
}

