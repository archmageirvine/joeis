package irvine.oeis.a338;

import java.util.concurrent.atomic.AtomicLong;

import irvine.math.lattice.Canons;
import irvine.math.lattice.Hunter;
import irvine.math.lattice.Lattices;
import irvine.math.lattice.ParallelHunter;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A338211 Triangle of coefficients of perimeter polynomials for free polyominoes.
 * @author Sean A. Irvine
 */
public class A338211 extends Sequence0 {

  private int mN = -1;
  private int mM = 0;
  private AtomicLong[] mPerimeterCounts = new AtomicLong[0];

  @Override
  public Z next() {
    if (++mM >= mPerimeterCounts.length) {
      if (++mN == 0) {
        return Z.ONE; // exactly 1 polyomino with no perimeter
      }
      mM = 0;
      mPerimeterCounts = new AtomicLong[2 * mN + 3];
      for (int k = 0; k < mPerimeterCounts.length; ++k) {
        mPerimeterCounts[k] = new AtomicLong();
      }
      final ParallelHunter h = new ParallelHunter(6,
        () -> new Hunter(Lattices.Z2, true),
        () -> new Hunter(Lattices.Z2, true) {
          {
            setKeeper((animal, forbidden) -> {
              if (Canons.Z2_FREE.isFreeCanonical(animal)) {
                mPerimeterCounts[animal.perimeterSize(Lattices.Z2)].incrementAndGet();
              }
            });
          }
        });
      h.count(mN);
    }
    return Z.valueOf(mPerimeterCounts[mM].get());
  }
}
