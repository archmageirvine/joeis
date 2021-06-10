package irvine.oeis.a046;

import irvine.math.lattice.Lattices;
import irvine.math.lattice.ParallelWalker;
import irvine.math.lattice.SelfAvoidingWalker;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A046944 Number of self-avoiding walks of length n on the Laves graph.
 * @author Sean A. Irvine
 */
public class A046944 implements Sequence {

  private final ParallelWalker mWalker = new ParallelWalker(8, () -> new SelfAvoidingWalker(Lattices.HYDROGEN_PEROXIDE));
  private final long mC = Lattices.HYDROGEN_PEROXIDE.neighbour(Lattices.HYDROGEN_PEROXIDE.origin(), 0);
  private int mN = -1;

  @Override
  public Z next() {
    return ++mN == 0 ? Z.ONE : Z.valueOf(mWalker.count(mN, 3, 7, Lattices.HYDROGEN_PEROXIDE.origin(), mC));
  }
}
