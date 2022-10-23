package irvine.oeis.a006;

import irvine.math.lattice.Lattices;
import irvine.math.lattice.ParallelWalker;
import irvine.math.lattice.Trailer;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A006818 Trails of length n on hexagonal lattice.
 * @author Sean A. Irvine
 */
public class A006818 extends Sequence0 {

  private final long mC = Lattices.HEXAGONAL.neighbour(Lattices.HEXAGONAL.origin(), 0);
  private final ParallelWalker mWalker = new ParallelWalker(8, () -> new Trailer(Lattices.HEXAGONAL));
  private int mN = -1;

  @Override
  public Z next() {
    return ++mN == 0 ? Z.ONE : Z.valueOf(mWalker.count(mN, 6, 1, Lattices.HEXAGONAL.origin(), mC));
  }
}
