package irvine.oeis.a001;

import irvine.math.lattice.Lattices;
import irvine.math.lattice.ParallelWalker;
import irvine.math.lattice.SelfAvoidingCycler;
import irvine.math.lattice.SelfAvoidingWalker;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A001337 Number of n-step polygons on f.c.c. lattice.
 * @author Sean A. Irvine
 */
public class A001337 extends Sequence1 {

  private int mN = 0;
  private final long mC = Lattices.FCC.neighbour(Lattices.FCC.origin(), 0);
  private final ParallelWalker mWalker = new ParallelWalker(10,
    () -> new SelfAvoidingWalker(Lattices.FCC),
    () -> new SelfAvoidingCycler(Lattices.FCC, true));

  @Override
  public Z next() {
    return Z.valueOf(mWalker.count(++mN, 12, 7, Lattices.FCC.origin(), mC));
  }
}
