package irvine.oeis.a338;

import java.util.Arrays;

import irvine.math.lattice.Canons;
import irvine.math.lattice.Hunter;
import irvine.math.lattice.Lattices;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A338211 Perimeter poly free poly.
 * @author Sean A. Irvine
 */
public class A338211 implements Sequence {

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private int mN = -1;
  private int mM = 0;
  private long[] mPerimeterCounts = new long[0];

  @Override
  public Z next() {
    if (++mM >= mPerimeterCounts.length) {
      if(++mN == 0) {
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
      if (mVerbose) {
        System.out.println(mN + " perimeter polynomial " + Arrays.toString(mPerimeterCounts));
      }
    }
    return Z.valueOf(mPerimeterCounts[mM]);
  }
}
