package irvine.oeis.a117;

import irvine.math.lattice.ManhattanLattice;
import irvine.math.lattice.ParallelWalker;
import irvine.math.lattice.Walker;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A117633 Number of self-avoiding walks of n steps on a Manhattan square lattice.
 * @author Sean A. Irvine
 */
public class A117633 implements Sequence {

  private final ManhattanLattice mManhattanLattice = new ManhattanLattice();
  private final ParallelWalker mWalker = new ParallelWalker(() -> new Walker(mManhattanLattice), mManhattanLattice, 8);
  private final long mX1 = mManhattanLattice.toPoint(1, 0);
  private int mN = -1;

  @Override
  public Z next() {
    return ++mN == 0 ? Z.ONE : Z.valueOf(mWalker.count(mN, 2, 3, mManhattanLattice.origin(), mX1));
  }
}
