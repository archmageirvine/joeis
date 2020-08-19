package irvine.oeis.a322;

import irvine.math.lattice.Lattices;
import irvine.math.lattice.ParallelWalker;
import irvine.math.lattice.SelfAvoidingWalker;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A322419 Number of <code>n-step self-avoiding</code> walks on <code>L-lattice</code>.
 * @author Sean A. Irvine
 */
public class A322419 implements Sequence {

  private final ParallelWalker mWalker = new ParallelWalker(8, () -> new SelfAvoidingWalker(Lattices.L));
  private final long mX1 = Lattices.L.neighbour(Lattices.L.origin(), 0);
  private int mN = -1;

  @Override
  public Z next() {
    return ++mN == 0 ? Z.ONE : Z.valueOf(mWalker.count(mN, 2, 1, Lattices.L.origin(), mX1));
  }
}
