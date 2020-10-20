package irvine.oeis.a338;

import java.util.ArrayList;

import irvine.math.lattice.Hunter;
import irvine.math.lattice.Lattices;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A338212 a(n) is the number of fixed polyominoes with sprawl n.
 * @author Sean A. Irvine
 */
public class A338212 implements Sequence {

  private int mN = -1;
  private final ArrayList<long[]> mPerimeterCounts = new ArrayList<>();
  {
    mPerimeterCounts.add(new long[] {1L});
  }

  private int s(final int n) {
    // minimum perimeter for n cells
    return (int) Math.ceil(Math.sqrt(8 * n - 4) + 2);
  }

  @Override
  public Z next() {
    ++mN;
    if (s(mPerimeterCounts.size()) <= mN - mPerimeterCounts.size()) {
      final int n = mPerimeterCounts.size();
      final long[] counts = new long[2 * n + 3];
      mPerimeterCounts.add(counts);
      final Hunter h = new Hunter(Lattices.Z2, true) {
        {
          setKeeper((animal, forbidden) -> ++counts[animal.perimeterSize(Lattices.Z2)]);
        }
      };
      h.count(n);
    }
    Z sprawl = Z.ZERO;
    for (int k = 0; k < mPerimeterCounts.size(); ++k) {
      final long[] c = mPerimeterCounts.get(k);
      if (c.length > mN - k) {
        sprawl = sprawl.add(c[mN - k]);
      }
    }
    return sprawl;
  }
}
