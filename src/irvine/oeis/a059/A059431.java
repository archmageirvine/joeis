package irvine.oeis.a059;

import irvine.math.z.Z;

/**
 * A059431 Triangle formed when cumulative boustrophedon transform is applied to 1, 0, 0, 0, ..., read by rows from left to right.
 * @author Sean A. Irvine
 */
public class A059431 extends A059432 {

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
