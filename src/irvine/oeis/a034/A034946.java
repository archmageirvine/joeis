package irvine.oeis.a034;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A034946 Successive approximations to 11-adic integer sqrt(3).
 * @author Sean A. Irvine
 */
public class A034946 implements Sequence {

  private Z mM = Z.valueOf(11);
  private Z mPrev = null;
  private Z mA = Z.FIVE;

  @Override
  public Z next() {
    if (mPrev == null) {
      mPrev = Z.ZERO;
      return Z.ZERO;
    }
    while (true) {
      final Z b = mA.mod(mM);
      if (!b.equals(mPrev)) {
        mPrev = b;
        return b;
      }
      mA = b.square().add(b).subtract(3);
      mM = mM.multiply(11);
    }
  }
}
