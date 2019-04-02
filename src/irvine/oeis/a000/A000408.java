package irvine.oeis.a000;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.array.LongDynamicBooleanArray;

/**
 * A000408 Numbers that are the sum of three nonzero squares.
 * @author Sean A. Irvine
 */
public class A000408 implements Sequence {

  private final LongDynamicBooleanArray mSeq = new LongDynamicBooleanArray();
  private long mLast = -1;
  private long mDone = -1;

  private void update(final long n) {
    // Updates x^2 + y^2 + z^2
    // Note symmetric in x, y, z, so only need to do 1 loop for them
    final long x = LongUtils.sqrt(n);
    if (x > mDone) {
      final long xx = x * x;
      for (long y = 1; y <= x; ++y) {
        final long yy = xx + y * y;
        for (long z = 1; z <= x; ++z) {
          final long k = yy + z * z;
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

