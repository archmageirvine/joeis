package irvine.oeis.a076;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A076650 m-morphic numbers for any m equal to 26 (mod 50).
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
