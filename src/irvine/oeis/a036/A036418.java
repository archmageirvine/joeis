package irvine.oeis.a036;

import irvine.math.lattice.Lattices;
import irvine.math.lattice.ParallelWalker;
import irvine.math.lattice.SelfAvoidingCycler;
import irvine.math.lattice.SelfAvoidingWalker;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A036418 Number of self-avoiding polygons with perimeter n on hexagonal [ =triangular ] lattice.
 * @author Sean A. Irvine
 */
public class A036418 extends Sequence1 {

  private int mN = 0;
  private final long mC = Lattices.HEXAGONAL.neighbour(Lattices.HEXAGONAL.origin(), 0);
  private final ParallelWalker mWalker = new ParallelWalker(8,
    () -> new SelfAvoidingWalker(Lattices.HEXAGONAL),
    () -> new SelfAvoidingCycler(Lattices.HEXAGONAL, true));

  @Override
  public Z next() {
    return ++mN == 0 ? Z.ONE : Z.valueOf(mWalker.count(mN, 3, 1, Lattices.HEXAGONAL.origin(), mC)).divide(mN);
  }
}
