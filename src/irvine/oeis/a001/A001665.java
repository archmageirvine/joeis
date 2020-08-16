package irvine.oeis.a001;

import irvine.math.lattice.KagomeLattice;
import irvine.math.lattice.ParallelWalker;
import irvine.math.lattice.SelfAvoidingWalker;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001665 Number of <code>self-avoiding n-step</code> walks on Kagome lattice.
 * @author Sean A. Irvine
 */
public class A001665 implements Sequence {

  private final KagomeLattice mKagomeLattice = new KagomeLattice();
  private final ParallelWalker mWalker = new ParallelWalker(8, () -> new SelfAvoidingWalker(mKagomeLattice));
  private final long mC = mKagomeLattice.toPoint(1, 1);
  private int mN = -1;

  @Override
  public Z next() {
    return ++mN == 0 ? Z.ONE : Z.valueOf(mWalker.count(mN, 4, 3, mKagomeLattice.origin(), mC));
  }
}
