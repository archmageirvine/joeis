package irvine.oeis.a151;

import irvine.math.lattice.Lattices;
import irvine.math.lattice.ParallelHunter;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A151832 Number of fixed 6-dimensional polycubes with n cells.
 * @author Sean A. Irvine
 */
public class A151832 extends Sequence1 {

  private final ParallelHunter mHunter = new ParallelHunter(4, Lattices.hypercubic(6), true);
  private int mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(mHunter.count(++mN));
  }
}
