package irvine.oeis.a068;

import irvine.math.z.Z;
import irvine.oeis.a004.A004018;

/**
 * A068785 Number of Cartesian lattice points in or on the circle x^2 + y^2 = 10^n.
 * @author Sean A. Irvine
 */
public class A068785 extends A004018 {

  // Hiroaki Yamanouchi must have a better method

  private long mLim = 1;
  private long mN = 0;
  private Z mSum = Z.ZERO;

  @Override
  public Z next() {
    while (mN <= mLim) {
      mSum = mSum.add(super.next());
      ++mN;
    }
    mLim *= 10;
    return mSum;
  }
}
