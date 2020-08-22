package irvine.oeis.a008;

import irvine.math.lattice.Hunter;
import irvine.math.lattice.Lattices;
import irvine.math.lattice.ParallelHunter;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A008855 Triangle T(n,k), n&gt;=1, read by rows, where T(n,k) is the number of lattice polygons with area n and perimeter 2*k.
 * @author Sean A. Irvine
 */
public class A008855 implements Sequence {

  private long[] mPerimCounts = new long[0];
  private int mN = 3;
  private int mM = 0;
  private final ParallelHunter mHunter = new ParallelHunter(6,
    () -> new Hunter(Lattices.Z2, true),
    () -> new Hunter(Lattices.Z2, true) {
      {
        setKeeper((animal, forbidden) -> {
          if (!animal.isHoly(Lattices.Z2)) {
            ++mPerimCounts[animal.edgePerimeterSize(Lattices.Z2)];
          }
        });
      }
    }
  );

  @Override
  public Z next() {
    while (true) {
      if (++mM >= mPerimCounts.length) {
        mN += 2;
        mM = 0;
        mPerimCounts = new long[mN];
        mHunter.count((mN - 3) / 2);
      }
      if (mPerimCounts[mM] != 0) {
        return Z.valueOf(mPerimCounts[mM]);
      }
    }
  }
}
