package irvine.oeis.a081;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicBooleanArray;

/**
 * A081145 a(1)=1; thereafter, a(n) is the least positive integer which has not already occurred and is such that |a(n)-a(n-1)| is different from any |a(k)-a(k-1)| which has already occurred.
 * @author Sean A. Irvine
 */
public class A081145 extends Sequence1 {

  private final LongDynamicBooleanArray mSeenDiffs = new LongDynamicBooleanArray();
  private final HashSet<Long> mUsed = new HashSet<>();
  private long mA = 0;
  private long mLeastUnused = 1;

  @Override
  public Z next() {
    while (mUsed.remove(mLeastUnused)) {
      ++mLeastUnused;
    }
    long t = mLeastUnused;
    while (true) {
      final long d = Math.abs(mA - t);
      if (!mSeenDiffs.isSet(d) && mUsed.add(t)) {
        if (mA != 0) {
          mSeenDiffs.set(d);
        }
        mA = t;
        return Z.valueOf(mA);
      }
      ++t;
    }
  }
}
