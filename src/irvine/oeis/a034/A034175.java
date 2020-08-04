package irvine.oeis.a034;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.array.LongDynamicBooleanArray;

/**
 * A034175 <code>a(n)</code> is minimal such that <code>a(n)+a(n-1)</code> is a square and <code>a(n)</code> is not in <code>{a(0)</code>, ..., <code>a(n-1)}</code>.
 * @author Sean A. Irvine
 */
public class A034175 implements Sequence {

  private final LongDynamicBooleanArray mUsed = new LongDynamicBooleanArray();
  private long mPrev = -1;
  private long mLeastUnused = 1;

  @Override
  public Z next() {
    if (mPrev == -1) {
      mPrev = 0;
      mUsed.set(0L);
      return Z.ZERO;
    }
    while (mUsed.isSet(mLeastUnused)) {
      ++mLeastUnused;
    }
    long k = mLeastUnused - 1;
    while (true) {
      if (mUsed.isSet(++k)) {
        continue;
      }
      final long t = mPrev + k;
      final long s = LongUtils.sqrt(t);
      if (s * s == t) {
        mUsed.set(k);
        mPrev = k;
        return Z.valueOf(k);
      }
    }
  }
}

