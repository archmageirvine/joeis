package irvine.oeis.a010;

import irvine.math.lattice.Lattices;
import irvine.math.lattice.ParallelWalker;
import irvine.math.lattice.SelfAvoidingCycler;
import irvine.math.lattice.SelfAvoidingWalker;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A010570 Number of 2n-step 6-dimensional closed paths on 6-d cubic lattice.
 * @author Sean A. Irvine
 */
public class A010570 implements Sequence {

  private int mN = 0;
  private final long mC = Lattices.Z6.neighbour(Lattices.Z6.origin(), 0);
  private final ParallelWalker mWalker = new ParallelWalker(8,
    () -> new SelfAvoidingWalker(Lattices.Z6),
    () -> new SelfAvoidingCycler(Lattices.Z6, false));

  @Override
  public Z next() {
    mN += 2;
    return Z.valueOf(mWalker.count(mN, 12, 1, Lattices.Z6.origin(), mC));
  }
}
