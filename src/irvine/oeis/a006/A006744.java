package irvine.oeis.a006;

import irvine.math.lattice.Lattices;
import irvine.math.lattice.ParallelWalker;
import irvine.math.lattice.SelfAvoidingWalker;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A006744 Number of n-step self-avoiding walks on a Manhattan lattice.
 * @author Sean A. Irvine
 */
public class A006744 extends Sequence1 {

  private final ParallelWalker mWalker = new ParallelWalker(8, () -> new SelfAvoidingWalker(Lattices.MANHATTAN));
  private final long mX1 = Lattices.MANHATTAN.toPoint(1, 0);
  private int mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(mWalker.count(++mN, 1, 3, Lattices.MANHATTAN.origin(), mX1));
  }
}
