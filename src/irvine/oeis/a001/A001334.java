package irvine.oeis.a001;

import irvine.math.lattice.Lattices;
import irvine.math.lattice.ParallelWalker;
import irvine.math.lattice.SelfAvoidingWalker;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A001334 Number of n-step self-avoiding walks on hexagonal [ =triangular ] lattice.
 * @author Sean A. Irvine
 */
public class A001334 extends Sequence0 {

  private final ParallelWalker mWalker = new ParallelWalker(8, () -> new SelfAvoidingWalker(Lattices.HEXAGONAL));
  private final long mC = Lattices.HEXAGONAL.neighbour(Lattices.HEXAGONAL.origin(), 0);
  private int mN = -1;

  @Override
  public Z next() {
    return ++mN == 0 ? Z.ONE : Z.valueOf(mWalker.count(mN, 6, 1, Lattices.HEXAGONAL.origin(), mC));
  }
}
