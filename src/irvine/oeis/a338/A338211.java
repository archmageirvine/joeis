package irvine.oeis.a338;

import irvine.math.lattice.Canons;
import irvine.math.lattice.Hunter;
import irvine.math.lattice.Lattices;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A338211 allocated for Sean A. Irvine.
 * @author Sean A. Irvine
 */
public class A338211 implements Sequence {

  private int mN = -1;
  private int mM = 0;
  private long[] mPerimeterCounts = new long[0];

  @Override
  public Z next() {
    if (++mM >= mPerimeterCounts.length) {
      if (++mN == 0) {
        return Z.ONE; // exactly 1 polyomino with no perimeter
      }
      mM = 0;
      mPerimeterCounts = new long[2 * mN + 3];
      final Hunter h = new Hunter(Lattices.Z2, true) {
        {
          setKeeper((animal, forbidden) -> {
            if (Canons.Z2_FREE.isCanonical(animal)) {
              ++mPerimeterCounts[animal.perimeterSize(Lattices.Z2)];
            }
          });
        }
      };
      h.count(mN);
    }
    return Z.valueOf(mPerimeterCounts[mM]);
  }
}
