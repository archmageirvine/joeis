package irvine.oeis.a002;

import irvine.math.lattice.ParallelWalker;
import irvine.math.lattice.SquareLattice;
import irvine.math.lattice.Walker;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002900 Number of n-step walks on square lattice.
 * @author Sean A. Irvine
 */
public class A002900 implements Sequence {

  private final SquareLattice mSquareLattice = new SquareLattice();
  private final ParallelWalker mWalker = new ParallelWalker(() -> new Walker(mSquareLattice), mSquareLattice, 8);
  private final long mX1 = mSquareLattice.toPoint(1, 0);
  private int mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(mWalker.count(++mN, 2, 1, mSquareLattice.origin(), mX1));
  }
}
