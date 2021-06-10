package irvine.oeis.a344;

import irvine.math.lattice.Lattices;
import irvine.math.lattice.ParallelWalker;
import irvine.math.lattice.SelfAvoidingCycler;
import irvine.math.lattice.SelfAvoidingWalker;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A344071 Number of 2n-step self-avoiding cycles on the Laves graph.
 * @author Sean A. Irvine
 */
public class A344071 implements Sequence {

  private int mN = -2;
  private final long mC = Lattices.HYDROGEN_PEROXIDE.neighbour(Lattices.HYDROGEN_PEROXIDE.origin(), 0);
  private final ParallelWalker mWalker = new ParallelWalker(10,
    () -> new SelfAvoidingWalker(Lattices.HYDROGEN_PEROXIDE),
    () -> new SelfAvoidingCycler(Lattices.HYDROGEN_PEROXIDE, false));

  @Override
  public Z next() {
    mN += 2;
    return mN == 0 ? Z.ONE : Z.valueOf(mWalker.count(mN, 1, 7, Lattices.HYDROGEN_PEROXIDE.origin(), mC));
  }
}
