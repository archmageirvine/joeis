package irvine.oeis.a174;

import irvine.math.lattice.Lattices;
import irvine.math.lattice.NonadjacentWalker;
import irvine.math.lattice.ParallelWalker;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A174313 Number of n-step walks on hexagonal lattice (no points repeated, no adjacent points unless consecutive in path).
 * @author Sean A. Irvine
 */
public class A174313 extends Sequence0 {

  private final ParallelWalker mWalker = new ParallelWalker(8, () -> new NonadjacentWalker(Lattices.HEXAGONAL));
  private final long mC = Lattices.HEXAGONAL.neighbour(Lattices.HEXAGONAL.origin(), 0);
  private int mN = -1;

  @Override
  public Z next() {
    return ++mN == 0 ? Z.ONE : Z.valueOf(mWalker.count(mN, 6, 1, Lattices.HEXAGONAL.origin(), mC));
  }
}
