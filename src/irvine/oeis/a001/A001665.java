package irvine.oeis.a001;

import irvine.math.lattice.Lattices;
import irvine.math.lattice.ParallelWalker;
import irvine.math.lattice.SelfAvoidingWalker;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A001665 Number of self-avoiding n-step walks on Kagome lattice.
 * @author Sean A. Irvine
 */
public class A001665 extends Sequence0 {

  private final ParallelWalker mWalker = new ParallelWalker(8, () -> new SelfAvoidingWalker(Lattices.KAGOME));
  private final long mC = Lattices.KAGOME.toPoint(1, 1);
  private int mN = -1;

  @Override
  public Z next() {
    return ++mN == 0 ? Z.ONE : Z.valueOf(mWalker.count(mN, 4, 3, Lattices.KAGOME.origin(), mC));
  }
}
