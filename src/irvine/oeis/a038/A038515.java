package irvine.oeis.a038;

import irvine.math.lattice.Lattices;
import irvine.math.lattice.ParallelWalker;
import irvine.math.lattice.SelfAvoidingCycler;
import irvine.math.lattice.SelfAvoidingWalker;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A038515 Number of self-avoiding walks on a tetrahedral (diamond) net, having 2n steps and forming a closed loop.
 * @author Sean A. Irvine
 */
public class A038515 extends Sequence0 {

  private int mN = -2;
  private final long mC = Lattices.DIAMOND.neighbour(Lattices.DIAMOND.origin(), 0);
  private final ParallelWalker mWalker = new ParallelWalker(8,
    () -> new SelfAvoidingWalker(Lattices.DIAMOND),
    () -> new SelfAvoidingCycler(Lattices.DIAMOND, true));

  @Override
  public Z next() {
    mN += 2;
    return mN == 0 ? Z.ONE : Z.valueOf(mWalker.count(mN, 1, 15, Lattices.DIAMOND.origin(), mC));
  }
}
