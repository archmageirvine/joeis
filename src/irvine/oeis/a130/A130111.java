package irvine.oeis.a130;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.array.LongDynamicBooleanArray;

/**
 * A130111 Rearrangement of natural numbers such that each five terms sum up to a perfect square.
 * @author Sean A. Irvine
 */
public class A130111 implements Sequence {

  private final LongDynamicBooleanArray mUsed = new LongDynamicBooleanArray();
  private long mLeastUnused = 1;
  private long[] mNext = new long[5];
  private int mM = 5;

  @Override
  public Z next() {
    if (++mM >= mNext.length) {
      long s = 0;
      // Take first four unused numbers
      for (int k = 0; k < 4; ++k) {
        while (mUsed.isSet(mLeastUnused)) {
          ++mLeastUnused;
        }
        mNext[k] = mLeastUnused;
        s += mLeastUnused;
        mUsed.set(mLeastUnused++);
      }
      // Find next unused number resulting in a square sum
      long pos = mLeastUnused;
      while (true) {
        if (!mUsed.isSet(pos)) {
          final long t = s + pos;
          final long sqrt = LongUtils.sqrt(t);
          if (sqrt * sqrt == t) {
            mNext[4] = pos;
            mUsed.set(pos);
            mM = 0;
            break;
          }
        }
        ++pos;
      }
    }
    return Z.valueOf(mNext[mM]);
  }
}

