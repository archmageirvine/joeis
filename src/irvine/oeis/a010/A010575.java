package irvine.oeis.a010;

import irvine.math.lattice.Lattices;
import irvine.math.lattice.ParallelWalker;
import irvine.math.lattice.SelfAvoidingWalker;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A010575 Number of n-step self-avoiding walks on 4-d cubic lattice.
 * @author Sean A. Irvine
 */
public class A010575 implements Sequence {

  private final ParallelWalker mWalker = new ParallelWalker(8, () -> new SelfAvoidingWalker(Lattices.Z4));
  private final long mC = Lattices.Z4.neighbour(Lattices.Z4.origin(), 0);
  private int mN = -1;

  @Override
  public Z next() {
    return ++mN == 0 ? Z.ONE : Z.valueOf(mWalker.count(mN, 8, 1, Lattices.Z4.origin(), mC));
  }
}
