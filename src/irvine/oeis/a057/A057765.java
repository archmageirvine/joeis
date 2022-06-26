package irvine.oeis.a057;

import java.util.HashSet;
import java.util.Set;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A057765 Number of factorable subsets of a 1 X n uniform grid.
 * @author Sean A. Irvine
 */
public class A057765 implements Sequence {

  private int mN = 0;
  private long mLim = 0;
  private final Set<Long> mFactorable = new HashSet<>();

  private void search(final long set, final long s) {
    mFactorable.add(set);
    for (long t = s << 1; t < mLim; t <<= 1) {
      if ((set & t) == 0) {
        search(set | t, t);
      }
    }
  }

  private void startSearch(final long subset) {
    for (long s = subset << 1; s < mLim; s <<= 1) {
      if ((subset & s) == 0) {
        search(subset | s, s);
      }
    }
  }

  @Override
  public Z next() {
    mLim = 1L << ++mN;
    mFactorable.clear();
    for (int bits = 2; bits <= mN / 2; ++bits) {
      for (long set = (1L << bits) - 1; set < mLim; set = LongUtils.swizzle(set)) {
        startSearch(set);
      }
    }
    return Z.valueOf(mFactorable.size());
  }
}
