package irvine.oeis.a057;

import irvine.math.lattice.Canons;
import irvine.math.lattice.Hunter;
import irvine.math.lattice.Lattices;
import irvine.math.lattice.ParallelHunter;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A057424 Diagonally symmetric (about diagonal 2) 2n-celled polyominoes with 1 hole.
 * @author Sean A. Irvine
 */
public class A057424 extends AbstractSequence {

  /* Construct the sequence. */
  public A057424() {
    super(6);
  }

  private final ParallelHunter mHunter = new ParallelHunter(6,
    () -> new Hunter(Lattices.Z2, true),
    () -> new Hunter(Lattices.Z2, true) {
      {
        setKeeper((animal, forbidden) -> {
          if (Canons.Z2_FREE.isFreeCanonical(animal) && Canons.Z2_ONE_DIAGONAL_SYMMETRIC.isFreeCanonical(animal) && animal.countHoles(Lattices.Z2) == 1) {
            increment(1);
          }
        });
      }
    }
  );

  private int mN = 10;

  @Override
  public Z next() {
    mN += 2;
    return Z.valueOf(mHunter.count(mN));
  }
}
