package irvine.math.lattice;

import java.util.LinkedHashSet;

/**
 * Count the number of self-avoiding walks (and similar concepts) on a specified lattice.
 * @author Sean A. Irvine
 */
public class Walker extends LinkedHashSet<Long>  {

  private final Lattice mLattice;
  private long mCount = 0;
  private long[] mWorkspace;

  /**
   * Construct a walker on the specified lattice.
   * @param lattice underlying lattice
   */
  public Walker(final Lattice lattice) {
    mLattice = lattice;
    // Assume every point has same number of neighbours.  If this is not the case then
    // search will need to be overridden
    mWorkspace = mLattice.neighbours(mLattice.origin());
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
    System.out.println(mLattice.toString(point) + " " + remainingSteps);
    if (remainingSteps <= 0) {
      mCount += weight();
    } else {
      // todo this mechanism does not work real well, cannot use the second form
      // due to recursion that is going on here.  It might be better to ask
      // for neighbour 0,1,2,3,... and define such methods on lattice
      // todo something else is not working here
      for (final long p : mLattice.neighbours(point)) {
        //for (final long p : mLattice.neighbours(mWorkspace, point)) {
        if (isAcceptable(point, remainingSteps)) {
          add(p);
          search(p, remainingSteps - 1);
          remove(p);
        }
      }
    }
  }

  /**
   * Return the number of walks of specified length.
   * @param n length of walk
   * @return number of walks
   */
  public long count(final int n) {
    if (n <= 0) {
      return n < 0 ? 0 : 1;
    }
    mCount = 0;

    // todo initial symmetry considerations
    search(mLattice.origin(), n);
    return mCount;
  }

  /**
   * Noddy.
   * @param args ignored
   */
  public static void main(final String[] args) {
    final Walker walker = new Walker(new SquareLattice());
    for (int k = 0; k < 20; ++k) {
      System.out.println(walker.count(k));
    }
  }
}
