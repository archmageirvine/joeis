package irvine.oeis.a000;

import irvine.math.lattice.Canons;
import irvine.math.lattice.Hunter;
import irvine.math.lattice.Lattices;
import irvine.math.lattice.ParallelHunter;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A000988 Number of one-sided polyominoes with n cells.
 * @author Sean A. Irvine
 */
public class A000988 extends Sequence0 {

  private int mN = -1;
  private final ParallelHunter mHunter = new ParallelHunter(7, () -> new Hunter(Lattices.Z2, true) {
    {
      setKeeper((animal, forbidden) -> {
        if (Canons.Z2_ONE_SIDED.isFreeCanonical(animal)) {
          increment(1);
        }
      });
    }
  });

  @Override
  public Z next() {
    return Z.valueOf(mHunter.count(++mN));
  }
}
