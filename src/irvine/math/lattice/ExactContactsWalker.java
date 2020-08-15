package irvine.math.lattice;

/**
 * Count the number of self-avoiding walks with the specified number of contacts.
 * Note this kind of work cannot be simply made parallel because the initial seed
 * walks need not have exact number of specified contacts.
 * @author Sean A. Irvine
 */
public class ExactContactsWalker extends Walker {

  private final int mTargetContacts;
  private int mContacts = 0;

  /**
   * Construct a walker on the specified lattice.
   * @param lattice underlying lattice
   * @param numContacts number of contacts
   */
  public ExactContactsWalker(final Lattice lattice, final int numContacts) {
    super(lattice);
    mTargetContacts = numContacts;
  }

  @Override
  protected void search(final long point, final int remainingSteps, final int weight, final int axesMask) {
    if (remainingSteps <= 0) {
      if (mContacts == mTargetContacts) {
        mAccumulator.accumulate(mWalk, weight, axesMask);
      }
    } else {
      final int t = mWalk.length - remainingSteps;
      final int nc = mLattice.neighbourCount(point);
      outer:
      for (int k = 0; k < nc; ++k) {
        final long p = mLattice.neighbour(point, k);
        if (isAcceptable(p, remainingSteps)) {
          // For this new point, how many other adjacent points are already in the walk?
          int nnc = mContacts - 1; // -1 for where we are coming from
          for (int e = 0; e < mLattice.neighbourCount(p); ++e) {
            if (contains(mLattice.neighbour(p, e), remainingSteps)) {
              ++nnc;
            }
          }
          if (nnc <= mTargetContacts) {
            mWalk[t] = p;
            if (axesMask != mAllAxesMask) {
              // This walk has not yet used every available axis in a symmetric lattice.
              // Use symmetry to ensure first step in each axis is in the positive direction.
              for (int j = 0, i = 1; j < mLattice.dimension(); ++j, i <<= 1) {
                if ((axesMask & i) == 0) {
                  final long o = mLattice.ordinate(p, j);
                  if (o == 1) {
                    // First step in axis j, by symmetry we can skip the -1 change
                    final int prevContacts = mContacts;
                    mContacts = nnc;
                    search(p, remainingSteps - 1, 2 * weight, axesMask | i);
                    mContacts = prevContacts;
                    continue outer; // Assumes at most one axis changes!
                  } else if (o == -1) {
                    continue outer;
                  }
                }
              }
            }
            final int prevContacts = mContacts;
            mContacts = nnc;
            search(p, remainingSteps - 1, weight, axesMask);
            mContacts = prevContacts;
          }
        }
      }
    }
  }
}
