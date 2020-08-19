package irvine.oeis.a006;

import irvine.math.lattice.Lattices;
import irvine.math.lattice.ParallelWalker;
import irvine.math.lattice.Trailer;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006819 Trails of length n on cubic lattice.
 * @author Sean A. Irvine
 */
public class A006819 implements Sequence {

  private final ParallelWalker mWalker = new ParallelWalker(8, () -> new Trailer(Lattices.Z3));
  private final long mC = Lattices.Z3.neighbour(Lattices.Z3.origin(), 0);
  private int mN = -1;

  @Override
  public Z next() {
    return ++mN == 0 ? Z.ONE : Z.valueOf(mWalker.count(mN, 6, 1, Lattices.Z3.origin(), mC));
  }
}
