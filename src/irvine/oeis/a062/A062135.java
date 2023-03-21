package irvine.oeis.a062;

import irvine.math.z.Z;
import irvine.oeis.a034.A034851;

/**
 * A062135.
 * @author Sean A. Irvine
 */
public class A062135 extends A034851 {

  private long mN = -3;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      mN += 2;
      mM = mN / 2;
      if (mN == -1) {
        return Z.ONE;
      }
    }
    return t(mM, mN - mM);
  }
}
