package irvine.oeis.a057;

import irvine.math.lattice.Canons;
import irvine.math.lattice.Hunter;
import irvine.math.lattice.Lattices;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A057730 Number of polyominoes (A000105) with perimeter 2n.
 * @author Sean A. Irvine
 */
public class A057730 implements Sequence {

  private final long[] mPerimeterCounts = new long[1000];
  private int mLeastChange = 0;

  private final Hunter mHunter = new Hunter(Lattices.Z2, true) {
    {
      setKeeper((animal, forbidden) -> {
        if (Canons.Z2_FREE.isCanonical(animal)) {
          final int p = animal.edgePerimeterSize(Lattices.Z2);
          ++mPerimeterCounts[p];
          if (p < mLeastChange) {
            mLeastChange = p;
          }
        }
      });
    }
  };

  private int mN = 0;
  private int mM = 0;

  @Override
  public Z next() {
    mN += 2;
    do {
      mLeastChange = Integer.MAX_VALUE;
      mHunter.count(++mM);
    } while (mLeastChange <= mN); // somewhat heuristic
    return Z.valueOf(mPerimeterCounts[mN]);
  }
}
