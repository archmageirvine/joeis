package irvine.oeis.a056;

import irvine.math.lattice.Canons;
import irvine.math.lattice.Hunter;
import irvine.math.lattice.Lattices;
import irvine.math.lattice.ParallelHunter;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A056881 Number of n-celled diagonally symmetric polyominoes without holes.
 * @author Sean A. Irvine
 */
public class A056881 extends Sequence1 {

  private final ParallelHunter mHunter = new ParallelHunter(6,
    () -> new Hunter(Lattices.Z2, true),
    () -> new Hunter(Lattices.Z2, true) {
      {
        setKeeper((animal, forbidden) -> {
          if (Canons.Z2_FREE.isFreeCanonical(animal) && Canons.Z2_DIAGONALLY_SYMMETRIC.isFreeCanonical(animal) && !animal.isHoly(Lattices.Z2)) {
            increment(1);
          }
        });
      }
    }
  );

  private int mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(mHunter.count(++mN));
  }
}
