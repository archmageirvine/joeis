package irvine.oeis.a001;

import irvine.math.lattice.Lattices;
import irvine.math.lattice.ParallelWalker;
import irvine.math.lattice.SelfAvoidingWalker;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001336 Number of <code>n-step self-avoiding</code> walks on f.c.c. lattice.
 * @author Sean A. Irvine
 */
public class A001336 implements Sequence {

  private final ParallelWalker mWalker = new ParallelWalker(8, () -> new SelfAvoidingWalker(Lattices.FCC));
  private final long mC = Lattices.FCC.neighbour(Lattices.FCC.origin(), 0);
  private int mN = -1;

  @Override
  public Z next() {
    return ++mN == 0 ? Z.ONE : Z.valueOf(mWalker.count(mN, 12, 7, Lattices.FCC.origin(), mC));
  }
}
