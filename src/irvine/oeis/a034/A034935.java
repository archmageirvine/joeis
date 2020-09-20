package irvine.oeis.a034;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A034935 Successive approximations to 5-adic integer sqrt(-1).
 * @author Sean A. Irvine
 */
public class A034935 implements Sequence {

  private Z mM = null;
  private Z mPrev = Z.NEG_ONE;

  @Override
  public Z next() {
    while (true) {
      mM = mM == null ? Z.ONE : mM.multiply(5);
      final Z t = Z.TWO.modPow(mM, mM);
      if (!t.equals(mPrev)) {
        mPrev = t;
        return t;
      }
    }
  }
}
