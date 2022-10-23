package irvine.oeis.a234;

import irvine.math.lattice.Canons;
import irvine.math.lattice.Hunter;
import irvine.math.lattice.Lattices;
import irvine.math.lattice.ParallelHunter;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A234012 Number of unbiased free polyominoes with 2n squares.
 * @author jmason
 */
public class A234012 extends Sequence1 {

  private int mN = 0;
  private final ParallelHunter mHunter = new ParallelHunter(7, () -> new Hunter(Lattices.Z2, true) {
    {
      setKeeper((animal, forbidden) -> {
        if (Canons.Z2_FREE.isFreeCanonical(animal)) {
          int white = 0;
          for (final long p : animal.points()) {
            final long x = Lattices.Z2.ordinate(p, 0);
            final long y = Lattices.Z2.ordinate(p, 1);
            white += (x ^ y) & 1;
          }
          if (2 * white == animal.size()) {
            increment(1);
          }
        }
      });
    }
  });

  @Override
  public Z next() {
    mN += 2;
    return Z.valueOf(mHunter.count(mN));
  }
}
