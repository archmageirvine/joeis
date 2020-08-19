package irvine.oeis.a005;

import irvine.math.lattice.Lattices;
import irvine.math.lattice.ParallelWalker;
import irvine.math.lattice.SelfAvoidingCycler;
import irvine.math.lattice.SelfAvoidingWalker;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005397 Number of n-step polygons on Kagome lattice.
 * @author Sean A. Irvine
 */
public class A005397 implements Sequence {

  private int mN = 2;
  private final long mC = Lattices.KAGOME.neighbour(Lattices.KAGOME.origin(), 0);
  private final ParallelWalker mWalker = new ParallelWalker(8,
    () -> new SelfAvoidingWalker(Lattices.KAGOME),
    () -> new SelfAvoidingCycler(Lattices.KAGOME, true));

  @Override
  public Z next() {
    return Z.valueOf(mWalker.count(++mN, 4, 3, Lattices.KAGOME.origin(), mC));
  }
}
