package irvine.oeis.a010;

import irvine.math.lattice.Lattice;
import irvine.math.lattice.Lattices;
import irvine.math.lattice.ParallelWalker;
import irvine.math.lattice.SelfAvoidingWalker;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A010577 Number of n-step self-avoiding walks on 6-d cubic lattice.
 * @author Sean A. Irvine
 */
public class A010577 implements Sequence {

  private static final Lattice Z6 = Lattices.hypercubic(6);
  private final ParallelWalker mWalker = new ParallelWalker(8, () -> new SelfAvoidingWalker(Z6));
  private final long mC = Z6.neighbour(Z6.origin(), 0);
  private int mN = -1;

  @Override
  public Z next() {
    return ++mN == 0 ? Z.ONE : Z.valueOf(mWalker.count(mN, 12, 1, Z6.origin(), mC));
  }
}
