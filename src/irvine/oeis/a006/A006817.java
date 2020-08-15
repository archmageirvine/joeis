package irvine.oeis.a006;

import irvine.math.lattice.ParallelWalker;
import irvine.math.lattice.SquareLattice;
import irvine.math.lattice.Trailer;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006817 Trails of length n on square lattice.
 * @author Sean A. Irvine
 */
public class A006817 implements Sequence {

  private final SquareLattice mSquareLattice = new SquareLattice();
  private final long mC = mSquareLattice.neighbour(mSquareLattice.origin(), 0);
  private final ParallelWalker mWalker = new ParallelWalker(mSquareLattice, 8, () -> new Trailer(mSquareLattice));
  private int mN = -1;

  @Override
  public Z next() {
    return ++mN == 0 ? Z.ONE : Z.valueOf(mWalker.count(mN, 4, 1, mSquareLattice.origin(), mC));
  }
}
