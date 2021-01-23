package irvine.oeis.a336;

import irvine.math.lattice.Lattices;
import irvine.math.lattice.NonadjacentWalker;
import irvine.math.lattice.ParallelWalker;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A336907 Number of n-step self-avoiding walks on the f.c.c. lattice with no non-contiguous adjacencies.
 * @author Sean A. Irvine
 */
public class A336907 implements Sequence {

  private final ParallelWalker mWalker = new ParallelWalker(8, () -> new NonadjacentWalker(Lattices.FCC));
  private final long mC = Lattices.FCC.neighbour(Lattices.FCC.origin(), 0);
  private int mN = -1;

  @Override
  public Z next() {
    return ++mN == 0 ? Z.ONE : Z.valueOf(mWalker.count(mN, 12, 7, Lattices.FCC.origin(), mC));
  }
}
