package irvine.oeis.a001;

import irvine.math.lattice.Lattices;
import irvine.math.lattice.ParallelWalker;
import irvine.math.lattice.SelfAvoidingCycler;
import irvine.math.lattice.SelfAvoidingWalker;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001409 Number of 2n-step polygons on cubic lattice.
 * @author Sean A. Irvine
 */
public class A001409 implements Sequence {

  private int mN = -2;
  private final long mC = Lattices.Z3.neighbour(Lattices.Z3.origin(), 0);
  private final ParallelWalker mWalker = new ParallelWalker(8,
    () -> new SelfAvoidingWalker(Lattices.Z3),
    () -> new SelfAvoidingCycler(Lattices.Z3, true));

  @Override
  public Z next() {
    mN += 2;
    return mN == 0 ? Z.ONE : Z.valueOf(mWalker.count(mN, 3, 1, Lattices.Z3.origin(), mC)).divide(mN);
  }
}
