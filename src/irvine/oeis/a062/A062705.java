package irvine.oeis.a062;

import irvine.math.z.Z;

/**
 * A062705 Array described in A062704 read by diagonals in direction of creation.
 * @author Sean A. Irvine
 */
public class A062705 extends A062704 {

  private int mN = 0;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM >= mN) {
      ++mN;
      mM = 0;
    }
    return (mN & 1) == 1 ? mB.get(mM + 1, mN - mM) : mB.get(mN - mM, mM + 1);
  }
}
