package irvine.oeis.a002;

import irvine.math.lattice.Lattices;
import irvine.math.lattice.ParallelWalker;
import irvine.math.lattice.SelfAvoidingWalker;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A002900 Number of n-step walks on square lattice.
 * @author Sean A. Irvine
 */
public class A002900 extends Sequence1 {

  private final ParallelWalker mWalker = new ParallelWalker(8, () -> new SelfAvoidingWalker(Lattices.Z2));
  private final long mX1 = Lattices.Z2.toPoint(1, 0);
  private int mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(mWalker.count(++mN, 2, 1, Lattices.Z2.origin(), mX1));
  }
}
