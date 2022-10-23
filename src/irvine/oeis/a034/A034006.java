package irvine.oeis.a034;

import irvine.math.lattice.Lattices;
import irvine.math.lattice.NonadjacentWalker;
import irvine.math.lattice.ParallelWalker;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A034006 Number of n-step self-avoiding walks on the 4-dimensional hypercubic lattice with no non-contiguous adjacencies.
 * @author Sean A. Irvine
 */
public class A034006 extends Sequence0 {

  private final ParallelWalker mWalker = new ParallelWalker(8, () -> new NonadjacentWalker(Lattices.Z4));
  private final long mC = Lattices.Z4.neighbour(Lattices.Z4.origin(), 0);
  private int mN = -1;

  @Override
  public Z next() {
    return ++mN == 0 ? Z.ONE : Z.valueOf(mWalker.count(mN, 8, 1, Lattices.Z4.origin(), mC));
  }
}
