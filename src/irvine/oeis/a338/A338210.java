package irvine.oeis.a338;

import irvine.math.lattice.Hunter;
import irvine.math.lattice.Lattices;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A338210 Triangle of coefficients of perimeter polynomials for fixed polyominoes.
 * @author Sean A. Irvine
 */
public class A338210 extends Sequence0 {

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
          setKeeper((animal, forbidden) -> ++mPerimeterCounts[animal.perimeterSize(Lattices.Z2)]);
        }
      };
      h.count(mN);
    }
    return Z.valueOf(mPerimeterCounts[mM]);
  }
}
