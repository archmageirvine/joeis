package irvine.oeis.a344;

import irvine.math.lattice.Lattices;
import irvine.math.lattice.NonadjacentWalker;
import irvine.math.lattice.ParallelWalker;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A344039 Number of n-step self-avoiding walks on the hypertriangular lattice with no non-contiguous adjacencies.
 * @author Sean A. Irvine
 */
public class A344039 extends Sequence0 {

  private final ParallelWalker mWalker = new ParallelWalker(8, () -> new NonadjacentWalker(Lattices.HYPERTRIANGULAR));
  private final long mC = Lattices.HYPERTRIANGULAR.neighbour(Lattices.HYPERTRIANGULAR.origin(), 0);
  private int mN = -1;

  @Override
  public Z next() {
    return ++mN == 0 ? Z.ONE : Z.valueOf(mWalker.count(mN, 6, 7, Lattices.HYPERTRIANGULAR.origin(), mC));
  }
}
