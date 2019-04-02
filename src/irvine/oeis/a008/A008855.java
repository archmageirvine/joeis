package irvine.oeis.a008;

import irvine.math.Polyomino;
import irvine.math.z.Z;
import irvine.oeis.a006.A006724;

/**
 * A008855 Table of polygons on square lattice by area and perimeter.
 * @author Sean A. Irvine
 */
public class A008855 extends A006724 {

  private long[] mPerimCounts = new long[0];
  private int mN = 3;
  private int mM = 0;

  @Override
  public Z next() {
    while (true) {
      if (++mM >= mPerimCounts.length) {
        mN += 2;
        mM = 0;
        super.next();
        mPerimCounts = new long[mN];
        for (final Polyomino p : mA) {
          ++mPerimCounts[p.perimeter()];
        }
      }
      if (mPerimCounts[mM] != 0) {
        return Z.valueOf(mPerimCounts[mM]);
      }
    }
  }
}
