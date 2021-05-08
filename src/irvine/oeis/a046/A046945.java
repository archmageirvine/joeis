package irvine.oeis.a046;

import irvine.math.lattice.Lattices;
import irvine.math.lattice.ParallelWalker;
import irvine.math.lattice.SelfAvoidingWalker;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A046945 Number of self-avoiding walks of length n on hypertriangular lattice.
 * @author Sean A. Irvine
 */
public class A046945 implements Sequence {

  private final ParallelWalker mWalker = new ParallelWalker(8, () -> new SelfAvoidingWalker(Lattices.HYPERTRIANGULAR));
  private final long mC = Lattices.HYPERTRIANGULAR.neighbour(Lattices.HYPERTRIANGULAR.origin(), 0);
  private int mN = -1;

  @Override
  public Z next() {
    return ++mN == 0 ? Z.ONE : Z.valueOf(mWalker.count(mN, 6, 7, Lattices.HYPERTRIANGULAR.origin(), mC));
  }
}
