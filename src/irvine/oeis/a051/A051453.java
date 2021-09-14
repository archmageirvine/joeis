package irvine.oeis.a051;

import irvine.math.z.Z;
import irvine.oeis.a000.A000961;

/**
 * A051452.
 * @author Sean A. Irvine
 */
public class A051453 extends A000961 {

  private Z mN = Z.ZERO;
  private Z mA = super.next();
  private Z mLcm = Z.ONE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      mLcm = mLcm.lcm(mN);
      if (mN.equals(mA)) {
        mA = super.next();
        if (mLcm.add(1).isProbablePrime()) {
          return mN;
        }
      }
    }
  }
}
