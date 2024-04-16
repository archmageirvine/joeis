package irvine.oeis.a057;

import java.util.HashSet;
import java.util.Set;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A057818 Number of factorable (see A057765 for definition) subsets of a 2 X n uniform grid.
 * @author Sean A. Irvine
 */
public class A057818 extends Sequence1 {

  protected int mN = 0;
  private long mLim = 0;
  private final Set<Long> mFactorable = new HashSet<>();

  private void search(final long set0, final long set1, final long s) {
    for (long t = s << 1; t < mLim; t <<= 1) {
      if ((set0 & t) == 0) {
        final long s0 = set0 | t;
        mFactorable.add((s0 << 32) | set1);
        search(s0, set1, t);
      }
    }
    for (long t = s; t < mLim; t <<= 1) {
      if ((set1 & t) == 0) {
        final long s1 = set1 | t;
        mFactorable.add((set0 << 32) | s1);
        search(set0, s1, t);
      }
    }
  }

  @Override
  public Z next() {
    if (++mN > 31) {
      throw new UnsupportedOperationException();
    }
    mLim = 1L << mN;
    mFactorable.clear();
    for (int bits = 2; bits <= mN; ++bits) {
      for (long set = (1L << bits) - 1; set < mLim; set = Functions.SWIZZLE.l(set)) {
        search(set, 0, set);
        search(0, set, set);
      }
    }
    return Z.valueOf(mFactorable.size());
  }
}
