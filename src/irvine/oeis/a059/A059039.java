package irvine.oeis.a059;

import irvine.math.z.Z;

/**
 * A059039 Triangle in A059037 read by rows in natural order.
 * @author Sean A. Irvine
 */
public class A059039 extends A059037 {

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
