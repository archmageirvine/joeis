package irvine.oeis.a322;

import irvine.math.lattice.LLattice;
import irvine.math.lattice.ParallelWalker;
import irvine.math.lattice.Walker;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A322419 Number of <code>n-step self-avoiding</code> walks on <code>L-lattice</code>.
 * @author Sean A. Irvine
 */
public class A322419 implements Sequence {

  private final LLattice mLLattice = new LLattice();
  private final ParallelWalker mWalker = new ParallelWalker(() -> new Walker(mLLattice), mLLattice, 8);
  private final long mX1 = mLLattice.neighbour(mLLattice.origin(), 0);
  private int mN = -1;

  @Override
  public Z next() {
    return ++mN == 0 ? Z.ONE : Z.valueOf(mWalker.count(mN, 2, 1, mLLattice.origin(), mX1));
  }
}
