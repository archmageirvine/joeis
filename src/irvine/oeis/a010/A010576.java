package irvine.oeis.a010;

import irvine.math.lattice.Lattices;
import irvine.math.lattice.ParallelWalker;
import irvine.math.lattice.SelfAvoidingWalker;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A010576 Number of n-step self-avoiding walks on 5-d cubic lattice.
 * @author Sean A. Irvine
 */
public class A010576 implements Sequence {

  private final ParallelWalker mWalker = new ParallelWalker(8, () -> new SelfAvoidingWalker(Lattices.Z5));
  private final long mC = Lattices.Z5.neighbour(Lattices.Z5.origin(), 0);
  private int mN = -1;

  @Override
  public Z next() {
    return ++mN == 0 ? Z.ONE : Z.valueOf(mWalker.count(mN, 10, 1, Lattices.Z5.origin(), mC));
  }
}
