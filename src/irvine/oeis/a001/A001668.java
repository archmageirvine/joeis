package irvine.oeis.a001;

import irvine.math.lattice.Lattices;
import irvine.math.lattice.ParallelWalker;
import irvine.math.lattice.SelfAvoidingWalker;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A001668 Number of self-avoiding n-step walks on honeycomb lattice.
 * @author Sean A. Irvine
 */
public class A001668 extends Sequence0 {

  private final ParallelWalker mWalker = new ParallelWalker(8, () -> new SelfAvoidingWalker(Lattices.HONEYCOMB));
  private final long mC = Lattices.HONEYCOMB.neighbour(Lattices.HONEYCOMB.origin(), 0);
  private int mN = -1;

  @Override
  public Z next() {
    return ++mN == 0 ? Z.ONE : Z.valueOf(mWalker.count(mN, 3, 3, Lattices.HONEYCOMB.origin(), mC));
  }
}
