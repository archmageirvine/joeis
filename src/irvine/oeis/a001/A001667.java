package irvine.oeis.a001;

import irvine.math.lattice.Lattices;
import irvine.math.lattice.ParallelWalker;
import irvine.math.lattice.SelfAvoidingCycler;
import irvine.math.lattice.SelfAvoidingWalker;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A001667 2n-step polygons on b.c.c. lattice.
 * @author Sean A. Irvine
 */
public class A001667 extends Sequence2 {

  private int mN = 2;
  private final long mC = Lattices.BCC.neighbour(Lattices.BCC.origin(), 0);
  private final ParallelWalker mWalker = new ParallelWalker(10,
    () -> new SelfAvoidingWalker(Lattices.BCC),
    () -> new SelfAvoidingCycler(Lattices.BCC, false));

  @Override
  public Z next() {
    mN += 2;
    return Z.valueOf(mWalker.count(mN, 8, 7, Lattices.BCC.origin(), mC));
  }
}
