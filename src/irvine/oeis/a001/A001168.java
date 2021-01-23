package irvine.oeis.a001;

import irvine.math.lattice.Hunter;
import irvine.math.lattice.Lattices;
import irvine.math.lattice.ParallelHunter;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001168 Number of fixed polyominoes with n cells.
 * @author Sean A. Irvine
 */
public class A001168 implements Sequence {

  private final ParallelHunter mHunter = new ParallelHunter(7, () -> new Hunter(Lattices.Z2, true));
  private int mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(mHunter.count(++mN));
  }
}
