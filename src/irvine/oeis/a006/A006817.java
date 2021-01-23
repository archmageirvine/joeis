package irvine.oeis.a006;

import irvine.math.lattice.Lattices;
import irvine.math.lattice.ParallelWalker;
import irvine.math.lattice.Trailer;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006817 Trails of length n on square lattice.
 * @author Sean A. Irvine
 */
public class A006817 implements Sequence {

  private final long mC = Lattices.Z2.neighbour(Lattices.Z2.origin(), 0);
  private final ParallelWalker mWalker = new ParallelWalker(8, () -> new Trailer(Lattices.Z2));
  private int mN = -1;

  @Override
  public Z next() {
    return ++mN == 0 ? Z.ONE : Z.valueOf(mWalker.count(mN, 4, 1, Lattices.Z2.origin(), mC));
  }
}
