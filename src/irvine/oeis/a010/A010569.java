package irvine.oeis.a010;

import irvine.math.lattice.Lattices;
import irvine.math.lattice.ParallelWalker;
import irvine.math.lattice.SelfAvoidingCycler;
import irvine.math.lattice.SelfAvoidingWalker;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A010569 Number of 2n-step 5-dimensional closed paths on 5-d cubic lattice.
 * @author Sean A. Irvine
 */
public class A010569 implements Sequence {

  private int mN = 0;
  private final long mC = Lattices.Z5.neighbour(Lattices.Z5.origin(), 0);
  private final ParallelWalker mWalker = new ParallelWalker(8,
    () -> new SelfAvoidingWalker(Lattices.Z5),
    () -> new SelfAvoidingCycler(Lattices.Z5, false));

  @Override
  public Z next() {
    mN += 2;
    return Z.valueOf(mWalker.count(mN, 10, 1, Lattices.Z5.origin(), mC));
  }
}
