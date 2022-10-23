package irvine.oeis.a001;

import irvine.math.lattice.Lattices;
import irvine.math.lattice.ParallelWalker;
import irvine.math.lattice.SelfAvoidingWalker;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A001394 Number of n-step self-avoiding walks on diamond.
 * @author Sean A. Irvine
 */
public class A001394 extends Sequence0 {

  private int mN = -1;
  private final long mC = Lattices.DIAMOND.neighbour(Lattices.DIAMOND.origin(), 0);
  private final ParallelWalker mWalker = new ParallelWalker(8, () -> new SelfAvoidingWalker(Lattices.DIAMOND));

  @Override
  public Z next() {
    return ++mN == 0 ? Z.ONE : Z.valueOf(mWalker.count(mN, 4, 15, Lattices.DIAMOND.origin(), mC));
  }
}
