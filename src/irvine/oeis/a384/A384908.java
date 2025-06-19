package irvine.oeis.a384;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicBooleanArray;
import irvine.util.array.LongDynamicLongArray;

/**
 * A384908 allocated for Ali Sada.
 * @author Sean A. Irvine
 */
public class A384908 extends Sequence1 {

  private final LongDynamicBooleanArray mUsed = new LongDynamicBooleanArray();
  private final LongDynamicLongArray mL = new LongDynamicLongArray();
  private long mLeastUnused = 1;

  private long get(final long n) {
    final long v = mL.get(n);
    return v == 0 ? n : v;
  }

  @Override
  public Z next() {
    while (mUsed.isSet(mLeastUnused)) {
      ++mLeastUnused;
    }
    long c = mLeastUnused;
    if (get(1) == c) {
      ++c;
      while (mUsed.isSet(c)) {
        ++c;
      }
    }
    long m = 1;
    while (get(m) != c) {
      ++m;
    }
    mUsed.set(c);
    for (long k = 1; k < m; ++k) {
      final long t = get(k);
      mL.set(k, get(k + m));
      mL.set(k + m, t);
    }
    return Z.valueOf(get(1));
  }
}
