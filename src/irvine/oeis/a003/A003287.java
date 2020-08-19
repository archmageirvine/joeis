package irvine.oeis.a003;

import irvine.math.lattice.Lattices;
import irvine.math.lattice.ParallelWalker;
import irvine.math.lattice.SelfAvoidingCycler;
import irvine.math.lattice.SelfAvoidingWalker;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003287 Number of <code>n-step self-avoiding</code> walks on f.c.c. lattice from <code>(0,0,0)</code> to <code>(0,1,1)</code>.
 * @author Sean A. Irvine
 */
public class A003287 implements Sequence {

  private int mN = 1;
  private final long mC = Lattices.FCC.neighbour(Lattices.FCC.origin(), 0);
  private final ParallelWalker mWalker = new ParallelWalker(8,
    () -> new SelfAvoidingWalker(Lattices.FCC),
    () -> new SelfAvoidingCycler(Lattices.FCC, false));

  @Override
  public Z next() {
    return Z.valueOf(mWalker.count(++mN, 1, 7, Lattices.FCC.origin(), mC));
  }
}
