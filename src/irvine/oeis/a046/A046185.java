package irvine.oeis.a046;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;

/**
 * A046185 A B2-sequence due to Rachel Lewis.
 * @author Sean A. Irvine
 */
public class A046185 extends MemorySequence {

  private static final long[] SMALL = {1, 2, 4, 8, 13, 21, 31, 45, 66, 81, 97, 123, 148, 182, 204, 252, 291, 324, 352, 415, 486, 540, 651, 706, 781, 864, 963, 1003, 1148, 1217, 1371, 1409, 1523, 1673, 1974, 2105, 2191, 2317, 2496, 2652, 2726, 2858, 3219, 3268, 3500, 3605, 3864, 3962, 4237, 4334, 4659, 4767, 5235, 5282, 5545, 5798, 6285, 6452, 6752, 7305, 7433, 7523, 8024, 8679, 9012, 9327, 9703, 10103};
  private final TreeSet<Long> mDifferences = new TreeSet<>();
  private long mM = 10105;

  private boolean isOk(final long m) {
    for (final Z t : this) {
      if (mDifferences.contains(m - t.longValueExact())) {
        return false;
      }
    }
    return true;
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n < SMALL.length) {
      return Z.valueOf(SMALL[n]);
    }
    while (!isOk(++mM)) {
      // do nothing
    }
    for (final Z t : this) {
      mDifferences.add(mM - t.longValueExact());
    }
    return Z.valueOf(mM);
  }
}
