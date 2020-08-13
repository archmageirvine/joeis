package irvine.math.lattice;

import java.util.LinkedHashSet;

/**
 * Count the number of self-avoiding walks (and similar concepts) on a specified lattice.
 * @author Sean A. Irvine
 */
public class Walker extends LinkedHashSet<Long>  {

  private final Lattice mLattice;
  private long mCount = 0;

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
    return !contains(point);
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
      final int nc = mLattice.neighbourCount(point);
      for (int k = 0; k < nc; ++k) {
        final long p = mLattice.neighbour(point, k);
        if (isAcceptable(p, remainingSteps)) {
          add(p);
          search(p, remainingSteps - 1);
          remove(p);
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
    if (steps <= 0) {
      return steps < 0 ? 0 : 1;
    }
    for (final long pt : initialPoints) {
      add(pt);
    }
    mCount = 0;
    search(initialPoints[initialPoints.length - 1], steps - initialPoints.length);
    return mCount;
  }

  @Override
  public String toString() {
    final StringBuilder walk = new StringBuilder();
    for (final Long pt : this) {
      if (walk.length() > 0) {
        walk.append("->");
      }
      walk.append(mLattice.toString(pt));
    }
    return walk.toString();
  }

  /**
   * Noddy.
   * @param args ignored
   */
  public static void main(final String[] args) {
    final SquareLattice sl = new SquareLattice();
    final Walker walker = new Walker(sl);
    for (int k = 0; k < 22; ++k) {
      System.out.println(4 * walker.count(k, sl.origin(), sl.toPoint(1, 0)));
    }
  }
}
