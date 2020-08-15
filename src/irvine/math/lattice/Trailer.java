package irvine.math.lattice;

/**
 * Count the number of trails on a specified lattice.  Trails can reuse a
 * vertex, but not an edge.
 * @author Sean A. Irvine
 */
public class Trailer extends Walker {

  /**
   * Construct a walker on the specified lattice.
   * @param lattice underlying lattice
   */
  public Trailer(final Lattice lattice) {
    super(lattice);
  }

  /**
   * Check if this walk contains a particular edge.
   * @param a first point
   * @param b second point
   * @return true if <code>a-b</code> is in the walk
   */
  public boolean contains(final long a, final long b, final int remainingSteps) {
    for (int k = mWalk.length - remainingSteps - 1; k > 0; --k) {
      if ((mWalk[k] == a && mWalk[k - 1] == b) || (mWalk[k] == b && mWalk[k - 1] == a)) {
        return true;
      }
    }
    return false;
  }


  @Override
  protected boolean isAcceptable(final long point, final int remainingSteps) {
    return !contains(point, mWalk[mWalk.length - remainingSteps - 1], remainingSteps);
  }
}
