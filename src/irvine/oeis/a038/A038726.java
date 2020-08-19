package irvine.oeis.a038;

import irvine.math.lattice.Lattices;
import irvine.math.lattice.NonadjacentWalker;
import irvine.math.lattice.ParallelWalker;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A038726 The number of <code>n-step self-avoiding</code> walks in a 5-dimensional hypercubic lattice with no non-contiguous adjacencies.
 * @author Sean A. Irvine
 */
public class A038726 implements Sequence {

  private final ParallelWalker mWalker = new ParallelWalker(8, () -> new NonadjacentWalker(Lattices.Z5));
  private final long mC = Lattices.Z5.neighbour(Lattices.Z5.origin(), 0);
  private int mN = -1;

  @Override
  public Z next() {
    return ++mN == 0 ? Z.ONE : Z.valueOf(mWalker.count(mN, 10, 1, Lattices.Z5.origin(), mC));
  }
}
