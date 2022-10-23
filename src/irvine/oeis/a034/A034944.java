package irvine.oeis.a034;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A034944 Successive approximations to 13-adic integer sqrt(-1).
 * @author Sean A. Irvine
 */
public class A034944 extends Sequence0 {

  private Z mM = null;
  private Z mPrev = Z.NEG_ONE;

  @Override
  public Z next() {
    while (true) {
      mM = mM == null ? Z.ONE : mM.multiply(13);
      final Z t = Z.FIVE.modPow(mM, mM);
      if (!t.equals(mPrev)) {
        mPrev = t;
        return t;
      }
    }
  }
}
