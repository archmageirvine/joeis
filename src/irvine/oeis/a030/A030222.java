package irvine.oeis.a030;

import irvine.math.lattice.Canons;
import irvine.math.lattice.Hunter;
import irvine.math.lattice.Lattices;
import irvine.math.lattice.ParallelHunter;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A030222 Number of n-polyplets (polyominoes connected at edges or corners); may contain holes.
 * @author Sean A. Irvine
 */
public class A030222 extends Sequence1 {

  private final ParallelHunter mHunter = new ParallelHunter(6,
    () -> new Hunter(Lattices.Z2Q, true),
    () -> new Hunter(Lattices.Z2Q, true) {
      {
        setKeeper((animal, forbidden) -> {
          if (Canons.Z2_FREE.isFreeCanonical(animal)) {
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
