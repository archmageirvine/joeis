package irvine.math.lattice;

import irvine.oeis.Sequence;
import irvine.oeis.a001.A001411;

/**
 * Count the number of self-avoiding walks (and similar concepts) on a specified lattice.
 * @author Sean A. Irvine
 */
public class Walker {

  // One of the main concerns is being able to quickly determine if a point is
  // already in the walk.  Their are various approaches to doing this.  Timing
  // suggests that simply searching through an unsorted array of points is
  // much faster than using a TreeSet, HashSet, or LinkedHashSet.  This
  // obviously cannot be true for exceedingly long walks, but for those that
  // can be practically done with brute force, the simple array solution is faster.

  private final Lattice mLattice;
  private long mCount = 0;
  private long[] mWalk = null;

  /**
   * Construct a walker on the specified lattice.
   * @param lattice underlying lattice
   */
  public Walker(final Lattice lattice) {
    mLattice = lattice;
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
   * Return the amount to increment the total count by for the current path.
   * In certain cases this is useful to handle symmetry considerations.
   * @return weight for the path
   */
  protected long weight() {
    return 1;
  }

  protected void search(final long point, final int remainingSteps) {
    if (remainingSteps <= 0) {
      mCount += weight();
    } else {
      final int t = mWalk.length - remainingSteps;
      final int nc = mLattice.neighbourCount(point);
      for (int k = 0; k < nc; ++k) {
        final long p = mLattice.neighbour(point, k);
        if (isAcceptable(p, remainingSteps)) {
          mWalk[t] = p;
          search(p, remainingSteps - 1);
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
  public long count(final int steps, final long... initialPoints) {
    if (initialPoints.length > steps) {
      return 1;
    }
    mWalk = new long[steps + 1];
    System.arraycopy(initialPoints, 0, mWalk, 0, initialPoints.length);
    mCount = 0;
    search(initialPoints[initialPoints.length - 1], steps - initialPoints.length + 1);
    return mCount;
  }

//  @Override
//  public String toString() {
//    final StringBuilder walk = new StringBuilder();
//    for (final Long pt : this) {
//      if (walk.length() > 0) {
//        walk.append("->");
//      }
//      walk.append(mLattice.toString(pt));
//    }
//    return walk.toString();
//  }

  /**
   * Noddy.
   * @param args ignored
   */
  public static void main(final String[] args) {
    if (args.length > 0 && "old".equals(args[0])) {
      final Sequence seq = new A001411();
      for (int k = 0; k < 21; ++k) {
        System.out.println(seq.next());
      }
    } else {
      final SquareLattice sl = new SquareLattice();
      final Walker walker = new Walker(sl);
      for (int k = 0; k < 21; ++k) {
        System.out.println(4 * walker.count(k, sl.origin(), sl.toPoint(1, 0)));
      }
    }
  }
}
