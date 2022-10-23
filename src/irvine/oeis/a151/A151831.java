package irvine.oeis.a151;

import irvine.math.lattice.Lattices;
import irvine.math.lattice.ParallelHunter;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A151831 Number of fixed 5-dimensional polycubes with n cells.
 * @author Sean A. Irvine
 */
public class A151831 extends Sequence1 {

  private final ParallelHunter mHunter = new ParallelHunter(4, Lattices.Z5, true);
  private int mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(mHunter.count(++mN));
  }
}
