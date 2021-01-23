package irvine.oeis.a034;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A034944 Successive approximations to 13-adic integer sqrt(-1).
 * @author Sean A. Irvine
 */
public class A034944 implements Sequence {

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
