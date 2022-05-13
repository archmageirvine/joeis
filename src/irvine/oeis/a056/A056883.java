package irvine.oeis.a056;

import irvine.math.lattice.Canons;
import irvine.math.lattice.Hunter;
import irvine.math.lattice.Lattices;
import irvine.math.lattice.ParallelHunter;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A056883 Number of n-celled rotationally symmetric polyominoes without holes.
 * @author Sean A. Irvine
 */
public class A056883 implements Sequence {

  private final ParallelHunter mHunter = new ParallelHunter(6,
    () -> new Hunter(Lattices.Z2, true),
    () -> new Hunter(Lattices.Z2, true) {
      {
        setKeeper((animal, forbidden) -> {
          if (Canons.Z2_FREE.isCanonical(animal) && Canons.Z2_C2.isCanonical(animal) && !animal.isHoly(Lattices.Z2)) {
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
