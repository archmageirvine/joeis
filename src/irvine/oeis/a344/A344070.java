package irvine.oeis.a344;

import irvine.math.lattice.Lattices;
import irvine.math.lattice.ParallelWalker;
import irvine.math.lattice.SelfAvoidingCycler;
import irvine.math.lattice.SelfAvoidingWalker;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A344070 allocated for Sean A. Irvine.
 * @author Sean A. Irvine
 */
public class A344070 implements Sequence {

  private int mN = -1;
  private final long mC = Lattices.HYPERTRIANGULAR.neighbour(Lattices.HYPERTRIANGULAR.origin(), 0);
  private final ParallelWalker mWalker = new ParallelWalker(10,
    () -> new SelfAvoidingWalker(Lattices.HYPERTRIANGULAR),
    () -> new SelfAvoidingCycler(Lattices.HYPERTRIANGULAR, false));

  @Override
  public Z next() {
    return ++mN == 0 ? Z.ONE : Z.valueOf(mWalker.count(mN, 1, 7, Lattices.HYPERTRIANGULAR.origin(), mC));
  }
}
