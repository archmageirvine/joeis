package irvine.oeis.a001;

import irvine.math.lattice.ParallelWalker;
import irvine.math.lattice.SquareLattice;
import irvine.math.lattice.Walker;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001411 Number of <code>n-step self-avoiding</code> walks on square lattice.
 * @author Sean A. Irvine
 */
public class A001411 implements Sequence {

  protected final SquareLattice mSquareLattice = new SquareLattice();
  protected final ParallelWalker mWalker = new ParallelWalker(() -> new Walker(mSquareLattice), mSquareLattice, 8);
  private final long mX1 = mSquareLattice.toPoint(1, 0);
  private int mN = -1;

  @Override
  public Z next() {
    return ++mN == 0 ? Z.ONE : Z.valueOf(mWalker.count(mN, 4, 1, mSquareLattice.origin(), mX1));
  }
}
