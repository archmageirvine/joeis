package irvine.oeis.a173;

import irvine.math.lattice.NonadjacentWalker;
import irvine.math.lattice.ParallelWalker;
import irvine.math.lattice.SquareLattice;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A173380 Number of n-step walks on square lattice (no points repeated, no adjacent points unless consecutive in path).
 * @author Sean A. Irvine
 */
public class A173380 implements Sequence {

  private final SquareLattice mSquareLattice = new SquareLattice();
  private final ParallelWalker mWalker = new ParallelWalker(mSquareLattice, 8, () -> new NonadjacentWalker(mSquareLattice));
  private final long mX1 = mSquareLattice.toPoint(1, 0);
  private int mN = -1;

  @Override
  public Z next() {
    return ++mN == 0 ? Z.ONE : Z.valueOf(mWalker.count(mN, 4, 1, mSquareLattice.origin(), mX1));
  }
}
