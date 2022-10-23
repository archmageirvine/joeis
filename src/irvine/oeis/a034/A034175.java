package irvine.oeis.a034;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.array.LongDynamicBooleanArray;

/**
 * A034175 a(n) is minimal such that a(n)+a(n-1) is a square and a(n) is not in {a(0), ..., a(n-1)}.
 * @author Sean A. Irvine
 */
public class A034175 extends Sequence0 {

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

