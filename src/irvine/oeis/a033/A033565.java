package irvine.oeis.a033;

import irvine.math.lattice.Hunter;
import irvine.math.lattice.Lattices;
import irvine.math.lattice.ParallelHunter;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A033565 Partially directed animals on the square lattice.
 * @author Sean A. Irvine
 */
public class A033565 extends Sequence0 {

  private int mN = -1;
  private final ParallelHunter mHunter = new ParallelHunter(7, () -> new Hunter(Lattices.Z2PD, true));

  @Override
  public Z next() {
    return Z.valueOf(mHunter.count(++mN));
  }
}
