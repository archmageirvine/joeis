package irvine.oeis.a010;

import irvine.math.lattice.Lattices;
import irvine.math.lattice.ParallelWalker;
import irvine.math.lattice.SelfAvoidingCycler;
import irvine.math.lattice.SelfAvoidingWalker;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A010566 Number of <code>2n-step 2-dimensional</code> closed self-avoiding paths on square lattice.
 * @author Sean A. Irvine
 */
public class A010566 implements Sequence {

  private int mN = 0;
  private final long mC = Lattices.Z2.neighbour(Lattices.Z2.origin(), 0);
  private final ParallelWalker mWalker = new ParallelWalker(8,
    () -> new SelfAvoidingWalker(Lattices.Z2),
    () -> new SelfAvoidingCycler(Lattices.Z2, true));

  @Override
  public Z next() {
    mN += 2;
    return Z.valueOf(mWalker.count(mN, 4, 1, Lattices.Z2.origin(), mC));
  }
}
