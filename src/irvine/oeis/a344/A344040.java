package irvine.oeis.a344;

import irvine.math.lattice.Lattices;
import irvine.math.lattice.NonadjacentWalker;
import irvine.math.lattice.ParallelWalker;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A344040 Number of n-step self-avoiding walks on the Laves graph with no non-contiguous adjacencies.
 * @author Sean A. Irvine
 */
public class A344040 implements Sequence {

  private final ParallelWalker mWalker = new ParallelWalker(8, () -> new NonadjacentWalker(Lattices.HYDROGEN_PEROXIDE));
  private final long mC = Lattices.HYDROGEN_PEROXIDE.neighbour(Lattices.HYDROGEN_PEROXIDE.origin(), 0);
  private int mN = -1;

  @Override
  public Z next() {
    return ++mN == 0 ? Z.ONE : Z.valueOf(mWalker.count(mN, 3, 7, Lattices.HYDROGEN_PEROXIDE.origin(), mC));
  }
}
