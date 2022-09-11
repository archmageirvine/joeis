package irvine.oeis.a059;

import irvine.math.z.Z;

/**
 * A059034 Triangle in A059032 read by rows in natural order.
 * @author Sean A. Irvine
 */
public class A059034 extends A059032 {

  private int mN = -1;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return get(mN, (mN & 1) == 0 ? mN - mM : mM);
  }
}
