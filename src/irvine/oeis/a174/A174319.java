package irvine.oeis.a174;

import irvine.math.lattice.Lattices;
import irvine.math.lattice.NonadjacentWalker;
import irvine.math.lattice.ParallelWalker;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A174319 Number of n-step walks on cubic lattice (no points repeated, no adjacent points unless consecutive in path).
 * @author Sean A. Irvine
 */
public class A174319 extends Sequence0 {

  private final ParallelWalker mWalker = new ParallelWalker(8, () -> new NonadjacentWalker(Lattices.Z3));
  private final long mC = Lattices.Z3.neighbour(Lattices.Z3.origin(), 0);
  private int mN = -1;

  @Override
  public Z next() {
    return ++mN == 0 ? Z.ONE : Z.valueOf(mWalker.count(mN, 6, 1, Lattices.Z3.origin(), mC));
  }
}
