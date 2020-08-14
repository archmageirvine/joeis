package irvine.math.lattice;

/**
 * A self-avoiding walker that has no non-contiguous adjacencies.
 * @author Sean A. Irvine
 */
public class NonadjacentWalker extends Walker {

  private final Lattice mAdjacencyLattice;

  /**
   * Construct a walker on the specified lattice.
   * @param lattice underlying lattice
   * @param adjacencyLattice lattice to be used for adjacency testing
   */
  public NonadjacentWalker(final Lattice lattice, final Lattice adjacencyLattice) {
    super(lattice);
    mAdjacencyLattice = adjacencyLattice;
  }

  /**
   * Construct a walker on the specified lattice.
   * @param lattice underlying lattice
   */
  public NonadjacentWalker(final Lattice lattice) {
    this(lattice, lattice);
  }

  @Override
  protected boolean isAcceptable(final long point, final int remainingSteps) {
    if (!super.isAcceptable(point, remainingSteps)) {
      return false;
    }
    int neighbourCount = - 1; // -1 for where we are coming from
    for (int k = 0; k < mAdjacencyLattice.neighbourCount(point); ++k) {
      if (!super.isAcceptable(mAdjacencyLattice.neighbour(point, k), remainingSteps) && ++neighbourCount > 0) {
        return false;
      }
    }
    return true;
  }
}
