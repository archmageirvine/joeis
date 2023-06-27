package irvine.math.lattice;

/**
 * Count the number of self-avoiding walks (and similar concepts) on a specified lattice.
 * @author Sean A. Irvine
 */
public class SelfAvoidingWalker extends Walker {

  // One of the main concerns is being able to quickly determine if a point is
  // already in the walk.  There are various approaches to doing this.  Timing
  // suggests that simply searching through an unsorted array of points is
  // much faster than using a TreeSet, HashSet, or LinkedHashSet or even
  // a primitive long hash set such as the HPPC LongHashSet.  This
  // obviously cannot be true for exceedingly long walks, but for those that
  // can be practically done with brute force, the simple array solution is faster.

  /**
   * Construct a walker on the specified lattice.
   * @param lattice underlying lattice
   */
  public SelfAvoidingWalker(final Lattice lattice) {
    super(lattice);
  }

  @Override
  protected boolean isAcceptable(final long point, final int remainingSteps) {
    return !contains(point, remainingSteps);
  }
}
