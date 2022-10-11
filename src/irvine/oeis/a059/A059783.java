package irvine.oeis.a059;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.array.LongDynamicBooleanArray;

/**
 * A059783 Number of paths (without loops) in graph of n-dimensional hypercube starting at point (0,0,0,...,0) and ending at (1,1,1,...,1).
 * @author Sean A. Irvine
 */
public class A059783 implements Sequence {

  private int mN = 0;
  private Z mCount = Z.ZERO;
  private long mLim = 0;
  private LongDynamicBooleanArray mSeen;

  private void search(final long vertex, final long usedDim, final long mult, final int free) {
    if (vertex == 0) {
      mCount = mCount.add(mult);
      return;
    }
    final long lim = Math.min(mLim, usedDim << 1);
    for (long bit = 1; bit <= lim; bit <<= 1) {
      final long u = vertex ^ bit;
      if (!mSeen.isSet(u)) {
        mSeen.set(u);
        final long dim = usedDim | bit;
        if (usedDim == dim) {
          search(u, dim, mult, free);
        } else {
          search(u, dim, mult * free, free - 1);
        }
        mSeen.clear(u);
      }
    }
  }

  @Override
  public Z next() {
    mLim = (1L << ++mN) - 1;
    mCount = Z.ZERO;
    mSeen = new LongDynamicBooleanArray();
    final long farCorner = mLim;
    mSeen.set(farCorner);
    // We start at (1,1,...,1) and search to (0,0,...,0).
    // We can use symmetry arguments to ensure first step in dimension k occurs
    // before first step in dimension k+1.
    // To avoid a boundary problem in search() we make the very first step here
    mSeen.set(farCorner - 1);
    search(farCorner - 1, 1L, mN, mN - 1);
    return mCount;
  }
}
