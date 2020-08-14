package irvine.oeis.a046;

import irvine.math.lattice.ParallelWalker;
import irvine.math.lattice.SquareLattice;
import irvine.math.lattice.Walker;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A046661 Number of <code>n-step self-avoiding</code> walks on the square lattice with first step specified.
 * @author Sean A. Irvine
 */
public class A046661 implements Sequence {

  private final SquareLattice mSquareLattice = new SquareLattice();
  private final ParallelWalker mWalker = new ParallelWalker(() -> new Walker(mSquareLattice), mSquareLattice, 8);
  private final long mX1 = mSquareLattice.toPoint(1, 0);
  private int mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(mWalker.count(++mN, 1, 1, mSquareLattice.origin(), mX1));
  }
}
