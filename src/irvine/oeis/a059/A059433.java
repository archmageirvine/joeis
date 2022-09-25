package irvine.oeis.a059;

import irvine.math.z.Z;

/**
 * A059433 Triangle formed when the cumulative boustrophedon transform is applied to 1, 1, 1, 1, ..., read by rows from left to right.
 * @author Sean A. Irvine
 */
public class A059433 extends A059434 {

  private int mN = -1;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return get(mN, (mN & 1) == 1 ? mM : mN - mM);
  }
}
