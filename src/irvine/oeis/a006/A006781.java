package irvine.oeis.a006;

import irvine.math.lattice.Lattices;
import irvine.math.lattice.ParallelWalker;
import irvine.math.lattice.SelfAvoidingCycler;
import irvine.math.lattice.SelfAvoidingWalker;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A006781 Number of polygons of length 4n on Manhattan lattice.
 * @author Sean A. Irvine
 */
public class A006781 extends Sequence1 {

  private int mN = 0;
  private final long mC = Lattices.MANHATTAN.neighbour(Lattices.MANHATTAN.origin(), 0);
  private final ParallelWalker mWalker = new ParallelWalker(8,
    () -> new SelfAvoidingWalker(Lattices.MANHATTAN),
    () -> new SelfAvoidingCycler(Lattices.MANHATTAN, true));

  @Override
  public Z next() {
    return Z.valueOf(mWalker.count(4 * ++mN, 1, 3, Lattices.MANHATTAN.origin(), mC)).divide(mN);
  }
}
