package irvine.math.lattice;

/**
 * Count the number of self-avoiding cycles on a specified lattice.
 * @author Sean A. Irvine
 */
public class SelfAvoidingCycler extends Walker {

  private final int mMinSteps;

  /**
   * Construct a self-avoiding cycle finder on the specified lattice.
   * @param lattice underlying lattice
   * @param polygons if set cycles of length 2 are disallowed
   */
  public SelfAvoidingCycler(final Lattice lattice, final boolean polygons) {
    super(lattice);
    mMinSteps = polygons ? 2 : 1;
  }

  @Override
  protected boolean isAcceptable(final long point, final int remainingSteps) {
    return !contains(point, remainingSteps)
      && mLattice.distanceBound(point) <= remainingSteps;
  }

  @Override
  protected void search(final long point, final int remainingSteps, final int weight, final int axesMask) {
    if (remainingSteps <= 1) {
      if (mLattice.isAdjacentToOrigin(point)) {
        mAccumulator.accumulate(mWalk, weight, axesMask);
      }
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

  @Override
  public long count(final int steps, final int weight, final int axesMask, final long... initialPoints) {
    return steps <= mMinSteps ? 0 : super.count(steps, weight, axesMask, initialPoints);
  }
}
