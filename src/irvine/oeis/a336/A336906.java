package irvine.oeis.a336;

import irvine.math.lattice.Lattices;
import irvine.math.lattice.NonadjacentWalker;
import irvine.math.lattice.ParallelWalker;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A336906 Number of n-step self-avoiding walks on the b.c.c. lattice with no non-contiguous adjacencies.
 * @author Sean A. Irvine
 */
public class A336906 extends Sequence0 {

  private final ParallelWalker mWalker = new ParallelWalker(8, () -> new NonadjacentWalker(Lattices.BCC));
  private final long mC = Lattices.BCC.neighbour(Lattices.BCC.origin(), 0);
  private int mN = -1;

  @Override
  public Z next() {
    return ++mN == 0 ? Z.ONE : Z.valueOf(mWalker.count(mN, 8, 7, Lattices.BCC.origin(), mC));
  }
}
