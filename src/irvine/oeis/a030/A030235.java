package irvine.oeis.a030;

import irvine.math.lattice.Canons;
import irvine.math.lattice.Hunter;
import irvine.math.lattice.Lattices;
import irvine.math.lattice.ParallelHunter;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A030235 Number of n-celled polyplets without bilateral symmetry.
 * @author Sean A. Irvine
 */
public class A030235 extends Sequence1 {

  private final ParallelHunter mHunter = new ParallelHunter(7,
    () -> new Hunter(Lattices.Z2Q, true),
    () -> new Hunter(Lattices.Z2Q, true) {
    {
      setKeeper((animal, forbidden) -> {
        if (Canons.Z2_FREE.isFreeCanonical(animal) && !Canons.Z2_BILATERAL.isFreeCanonical(animal)) {
          increment(1);
        }
      });
    }
  });

  private int mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(mHunter.count(++mN));
  }
}
