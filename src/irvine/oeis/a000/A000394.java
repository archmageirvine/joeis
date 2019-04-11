package irvine.oeis.a000;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.array.LongDynamicBooleanArray;

/**
 * A000394 Numbers of form <code>x^2 +</code> y^2 + 7z^2.
 * @author Sean A. Irvine
 */
public class A000394 implements Sequence {

  private final LongDynamicBooleanArray mSeq = new LongDynamicBooleanArray();
  private long mLast = -1;
  private long mDone = -1;

  protected int multiplier() {
    return 7;
  }

  private void update(final long n) {
    // Updates x^2 + y^2 + 7z^2
    // Note symmetric in x and y, so only need to do 1 loop for them
    final long x = LongUtils.sqrt(n);
    if (x > mDone) {
      final long xx = x * x;
      for (long y = 0; y <= x; ++y) {
        final long yy = xx + y * y;
        for (long z = 0; z <= x; ++z) {
          final long k = yy + multiplier() * z * z;
          mSeq.set(k);
        }
      }
      final long zp = multiplier() * xx;
      for (long xp = 0; xp <= x; ++xp) {
        final long yy = xp * xp + zp;
        for (long y = 0; y <= x; ++y) {
          final long k = yy + y * y;
          mSeq.set(k);
        }
      }
      mDone = x;
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

