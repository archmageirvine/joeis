package irvine.oeis.a002;

import irvine.math.lattice.Lattices;
import irvine.math.lattice.ParallelWalker;
import irvine.math.lattice.SelfAvoidingWalker;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A002903 Number of n-step self-avoiding walks on b.c.c. lattice (version 1).
 * @author Sean A. Irvine
 */
public class A002903 extends Sequence0 {

  private final ParallelWalker mWalker = new ParallelWalker(8, () -> new SelfAvoidingWalker(Lattices.BCC));
  private final long mC = Lattices.BCC.neighbour(Lattices.BCC.origin(), 0);
  private int mN = -1;

  @Override
  public Z next() {
    return ++mN == 0 ? Z.ONE : Z.valueOf(mWalker.count(mN, 4, 7, Lattices.BCC.origin(), mC));
  }
}
