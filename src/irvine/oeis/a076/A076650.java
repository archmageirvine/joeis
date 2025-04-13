package irvine.oeis.a076;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A076585.
 * @author Sean A. Irvine
 */
public class A076650 extends Sequence1 {

  private Z mN = Z.FOUR;
  private Z mMod = Z.TEN;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (mN.equals(mMod)) {
        mMod = mMod.multiply(10);
      }
      if (mN.modPow(26, mMod).equals(mN)) {
        return mN;
      }
    }
  }
}
