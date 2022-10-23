package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A008927 Number of increasing sequences of star chain type with maximal element n.
 * @author Sean A. Irvine
 */
public class A008927 extends Sequence1 {

  // Storing all unexpanded paths would be expensive in space.
  // Recomputing for each value of n is expensive in time.
  // Here we do the computation in powers of 2.

  private long[] mCounts = {0, 1};
  private int mN = 0;
  private int mMin = 0;
  private int mMax = 1;

  private void search(final int[] chain, final int pos) {
    // Search all chains up to max, incrementing counts for those exceeding min
    final int c = chain[pos];
    if (c <= mMax) {
      if (c > mMin) {
        ++mCounts[c - mMin];
      }
      if (c < mMax) {
        for (int k = pos; k >= 0; --k) {
          chain[pos + 1] = c + chain[k];
          search(chain, pos + 1);
        }
      }
    }
  }

  @Override
  public Z next() {
    if (++mN > mMax) {
      mCounts = new long[mMax + 1];
      mMin = mMax;
      mMax *= 2;
      final int[] chain = new int[mMax];
      chain[0] = 1;
      search(chain, 0);
    }
    return Z.valueOf(mCounts[mN - mMin]);
  }
}
