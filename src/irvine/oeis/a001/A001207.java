package irvine.oeis.a001;

import irvine.math.lattice.Hunter;
import irvine.math.lattice.Lattices;
import irvine.math.lattice.ParallelHunter;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A001207 Number of fixed hexagonal polyominoes with n cells.
 * @author Sean A. Irvine
 */
public class A001207 extends Sequence1 {

  private final ParallelHunter mHunter = new ParallelHunter(6, () -> new Hunter(Lattices.HEXAGONAL, true));

  private int mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(mHunter.count(++mN));
  }
}
