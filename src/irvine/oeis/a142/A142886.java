package irvine.oeis.a142;

import irvine.math.lattice.Canons;
import irvine.math.lattice.Hunter;
import irvine.math.lattice.Lattices;
import irvine.math.lattice.ParallelHunter;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A142886 Number of polyominoes with n cells that have the symmetry group D_8.
 * @author Sean A. Irvine
 */
public class A142886 extends Sequence0 {

  private final ParallelHunter mHunter = new ParallelHunter(6,
    () -> new Hunter(Lattices.Z2, true),
    () -> new Hunter(Lattices.Z2, true) {
      {
        setKeeper((animal, forbidden) -> {
          if (Canons.Z2_FREE.isFreeCanonical(animal) && Canons.Z2_D8.isFreeCanonical(animal)) {
            increment(1);
          }
        });
      }
    }
  );

  private int mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(mHunter.count(++mN));
  }
}
