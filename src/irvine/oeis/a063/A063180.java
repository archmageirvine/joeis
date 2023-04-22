package irvine.oeis.a063;

import irvine.math.z.Z;

/**
 * A063180 The array of A063179 read by diagonals in direction of creation.
 * @author Sean A. Irvine
 */
public class A063180 extends A063179 {

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
