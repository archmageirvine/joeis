package irvine.oeis.a336;

import irvine.math.lattice.ManhattanLattice;
import irvine.math.lattice.NonadjacentWalker;
import irvine.math.lattice.ParallelWalker;
import irvine.math.lattice.SquareLattice;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A336662 Number of <code>n-step self-avoiding</code> walks on the Manhattan lattice with no non-contiguous adjacencies.
 * @author Sean A. Irvine
 */
public class A336662 implements Sequence {

  private final ManhattanLattice mManhattanLattice = new ManhattanLattice();
  private final ParallelWalker mWalker = new ParallelWalker(mManhattanLattice, 8, () -> new NonadjacentWalker(mManhattanLattice, new SquareLattice()));
  private final long mX1 = mManhattanLattice.toPoint(1, 0);
  private int mN = -1;

  @Override
  public Z next() {
    return ++mN == 0 ? Z.ONE : Z.valueOf(mWalker.count(mN, 2, 3, mManhattanLattice.origin(), mX1));
  }
}
