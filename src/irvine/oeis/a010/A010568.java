package irvine.oeis.a010;

import irvine.math.lattice.Lattices;
import irvine.math.lattice.ParallelWalker;
import irvine.math.lattice.SelfAvoidingCycler;
import irvine.math.lattice.SelfAvoidingWalker;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A010568 2n-step 4-dimensional closed paths on 4-d cubic lattice.
 * @author Sean A. Irvine
 */
public class A010568 implements Sequence {

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
