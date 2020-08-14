package irvine.math.lattice;

/**
 * Count the number of self-avoiding walks (and similar concepts) on a specified lattice.
 * @author Sean A. Irvine
 */
public class Walker {

  // One of the main concerns is being able to quickly determine if a point is
  // already in the walk.  Their are various approaches to doing this.  Timing
  // suggests that simply searching through an unsorted array of points is
  // much faster than using a TreeSet, HashSet, or LinkedHashSet or even
  // a primitive long hash set such as the HPPC LongHashSet.  This
  // obviously cannot be true for exceedingly long walks, but for those that
  // can be practically done with brute force, the simple array solution is faster.

  protected final Lattice mLattice;
  private final int mAllAxesMask;
  private long mCount = 0;
  protected long[] mWalk = null;
  private Accumulator mAccumulator = (walk, weight, axesMask) -> mCount += weight;

  /**
   * Construct a walker on the specified lattice.
   * @param lattice underlying lattice
   */
  public Walker(final Lattice lattice) {
    mLattice = lattice;
    mAllAxesMask = (1 << mLattice.dimension()) - 1;
  }

  /**
   * Increment the count by the specified amount.
   * @param count amount to increment count by
   */
  public void increment(final long count) {
    mCount += count;
  }

  /**
   * Set the function called for each walk.
   * @param accumulator the accumulator
   */
  public void setAccumulator(final Accumulator accumulator) {
    mAccumulator = accumulator;
  }

  /**
   * Is the given point acceptable to add to the path in progress.  This can be
   * overridden in subclasses to allow for exclusion of particular kinds of points
   * (for example those with negative coordinates or those adjacent to existing points).
   * @param point point under consideration
   * @return true iff the point is valid for inclusion in the current path
   */
  protected boolean isAcceptable(final long point, final int remainingSteps) {
    // Test if the point is already in the walk.  We work backwards
    // through the list because it is more likely that a given point
    // will be the same as a recent point and a distant point.
    for (int k = mWalk.length - remainingSteps - 1; k >= 0; --k) {
      if (mWalk[k] == point) {
        return false;
      }
    }
    return true;
  }

  /**
   * Walk.  If your lattice is at all complicated (e.g. more than one dimension
   * changes per step, then <code>axesMask</code> should be <code>mAllAxesMask</code>).
   * @param point the current head of the walk
   * @param remainingSteps the number of steps yet to be made
   * @param weight weight of this walk (i.e., accounting for symmetry etc.)
   * @param axesMask bits indicating which axes have been used so far
   */
  protected void search(final long point, final int remainingSteps, final int weight, final int axesMask) {
    if (remainingSteps <= 0) {
      mAccumulator.accumulate(mWalk, weight, axesMask);
    } else {
      final int t = mWalk.length - remainingSteps;
      final int nc = mLattice.neighbourCount(point);
      outer:
      for (int k = 0; k < nc; ++k) {
        final long p = mLattice.neighbour(point, k);
        if (isAcceptable(p, remainingSteps)) {
          mWalk[t] = p;
          if (axesMask != mAllAxesMask) {
            // This walk has not yet used every available axis in a symmetric lattice.
            // Use symmetry to ensure first step in each axis is in the positive direction.
            for (int j = 0, i = 1; j < mLattice.dimension(); ++j, i <<= 1) {
              if ((axesMask & i) == 0) {
                final long o = mLattice.ordinate(p, j);
                if (o == 1) {
                  // First step in axis j, by symmetry we can skip the -1 change
                  search(p, remainingSteps - 1, 2 * weight, axesMask | i);
                  continue outer; // Assumes at most one axis changes!
                } else if (o == -1) {
                  continue outer;
                }
              }
            }
          }
          search(p, remainingSteps - 1, weight, axesMask);
        }
      }
    }
  }

  /**
   * Return the number of walks of specified length.
   * @param steps length of walk
   * @param initialPoints any initial points shared by all walks
   * @return number of walks
   */
  public long count(final int steps, final int weight, final int axesMask, final long... initialPoints) {
    if (initialPoints.length > steps) {
      return weight;
    }
    mWalk = new long[steps + 1];
    System.arraycopy(initialPoints, 0, mWalk, 0, initialPoints.length);
    mCount = 0;
    search(initialPoints[initialPoints.length - 1], steps - initialPoints.length + 1, weight, axesMask);
    return mCount;
  }
}
