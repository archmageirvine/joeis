package irvine.oeis.a010;

import irvine.math.lattice.Lattice;
import irvine.math.lattice.Lattices;
import irvine.math.lattice.ParallelWalker;
import irvine.math.lattice.SelfAvoidingCycler;
import irvine.math.lattice.SelfAvoidingWalker;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A010570 Number of 2n-step 6-dimensional closed paths on 6-d cubic lattice.
 * @author Sean A. Irvine
 */
public class A010570 extends Sequence1 {

  private static final Lattice Z6 = Lattices.hypercubic(6);
  private int mN = 0;
  private final long mC = Lattices.hypercubic(6).neighbour(Z6.origin(), 0);
  private final ParallelWalker mWalker = new ParallelWalker(8,
    () -> new SelfAvoidingWalker(Z6),
    () -> new SelfAvoidingCycler(Z6, false));

  @Override
  public Z next() {
    mN += 2;
    return Z.valueOf(mWalker.count(mN, 12, 1, Z6.origin(), mC));
  }
}
