package irvine.oeis.a010;

import irvine.math.lattice.Lattices;
import irvine.math.lattice.ParallelWalker;
import irvine.math.lattice.SelfAvoidingCycler;
import irvine.math.lattice.SelfAvoidingWalker;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A010568 Number of 2n-step self-avoiding closed paths on the 4-dimensional cubic lattice.
 * @author Sean A. Irvine
 */
public class A010568 extends Sequence1 {

  private int mN = 0;
  private final long mC = Lattices.Z4.neighbour(Lattices.Z4.origin(), 0);
  private final ParallelWalker mWalker = new ParallelWalker(8,
    () -> new SelfAvoidingWalker(Lattices.Z4),
    () -> new SelfAvoidingCycler(Lattices.Z4, false));

  @Override
  public Z next() {
    mN += 2;
    return Z.valueOf(mWalker.count(mN, 8, 1, Lattices.Z4.origin(), mC));
  }
}
