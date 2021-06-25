package irvine.oeis.a151;

import irvine.math.lattice.Hunter;
import irvine.math.lattice.Lattices;
import irvine.math.lattice.ParallelHunter;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A151830 Number of fixed 4-dimensional polycubes with n cells.
 * @author Sean A. Irvine
 */
public class A151830 implements Sequence {

  private final ParallelHunter mHunter = new ParallelHunter(7, () -> new Hunter(Lattices.Z4, true));
  private int mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(mHunter.count(++mN));
  }
}
