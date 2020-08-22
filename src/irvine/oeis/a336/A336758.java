package irvine.oeis.a336;

import irvine.math.lattice.Lattices;
import irvine.math.lattice.NonadjacentWalker;
import irvine.math.lattice.ParallelWalker;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A336758 Number of n-step self-avoiding walks on the honeycomb lattice with no non-contiguous adjacencies.
 * @author Sean A. Irvine
 */
public class A336758 implements Sequence {

  private final ParallelWalker mWalker = new ParallelWalker(8, () -> new NonadjacentWalker(Lattices.HONEYCOMB));
  private final long mC = Lattices.HONEYCOMB.neighbour(Lattices.HONEYCOMB.origin(), 0);
  private int mN = -1;

  @Override
  public Z next() {
    return ++mN == 0 ? Z.ONE : Z.valueOf(mWalker.count(mN, 3, 3, Lattices.HONEYCOMB.origin(), mC));
  }
}
