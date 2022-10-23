package irvine.oeis.a000;

import irvine.math.lattice.Hexagonal;
import irvine.math.lattice.Hunter;
import irvine.math.lattice.Lattices;
import irvine.math.lattice.ParallelHunter;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A000228 Number of hexagonal polyominoes (or hexagonal polyforms, or planar polyhexes) with n cells.
 * @author Sean A. Irvine
 */
public class A000228 extends Sequence1 {

  private final ParallelHunter mHunter = new ParallelHunter(6,
    () -> new Hunter(Lattices.HEXAGONAL, true),
    () -> new Hunter(Lattices.HEXAGONAL, true) {
      {
        setKeeper((animal, forbidden) -> {
          if (Hexagonal.isFreeCanonical(animal)) {
            increment(1);
          }
        });
      }
    }
  );

  protected int mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(mHunter.count(++mN));
  }
}
