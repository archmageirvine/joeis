package irvine.oeis.a057;

import irvine.math.lattice.Canons;
import irvine.math.lattice.Hunter;
import irvine.math.lattice.Lattices;
import irvine.math.lattice.ParallelHunter;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A057423 Diagonally symmetric n-celled polyominoes with 1 hole.
 * @author Sean A. Irvine
 */
public class A057423 extends AbstractSequence {

  /** Construct the sequence. */
  public A057423() {
    super(7);
  }

  private final ParallelHunter mHunter = new ParallelHunter(6,
    () -> new Hunter(Lattices.Z2, true),
    () -> new Hunter(Lattices.Z2, true) {
      {
        setKeeper((animal, forbidden) -> {
          if (Canons.Z2_FREE.isFreeCanonical(animal) && Canons.Z2_DIAGONALLY_SYMMETRIC.isFreeCanonical(animal) && animal.countHoles(Lattices.Z2) == 1) {
            increment(1);
          }
        });
      }
    }
  );

  private int mN = 6;

  @Override
  public Z next() {
    return Z.valueOf(mHunter.count(++mN));
  }
}
