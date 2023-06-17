package irvine.oeis.a057;

import irvine.math.lattice.Canons;
import irvine.math.lattice.Hunter;
import irvine.math.lattice.Lattices;
import irvine.math.lattice.ParallelHunter;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A057420 Axially symmetric n-celled polyominoes with 1 hole.
 * @author Sean A. Irvine
 */
public class A057420 extends AbstractSequence {

  /** Construct the sequence. */
  public A057420() {
    super(9);
  }

  private final ParallelHunter mHunter = new ParallelHunter(6,
    () -> new Hunter(Lattices.Z2, true),
    () -> new Hunter(Lattices.Z2, true) {
      {
        setKeeper((animal, forbidden) -> {
          if (Canons.Z2_FREE.isFreeCanonical(animal) && Canons.Z2_AXIALLY_SYMMETRIC.isFreeCanonical(animal) && animal.countHoles(Lattices.Z2) == 1) {
            increment(1);
          }
        });
      }
    }
  );

  private int mN = 8;

  @Override
  public Z next() {
    return Z.valueOf(mHunter.count(++mN));
  }
}
