package irvine.oeis.a034;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A034945 Successive approximations to 7-adic integer sqrt(2).
 * @author Sean A. Irvine
 */
public class A034945 extends Sequence0 {

  private Z mM = Z.SEVEN;
  private Z mPrev = null;
  private Z mA = Z.THREE;

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
      mA = b.square().add(b).subtract(2);
      mM = mM.multiply(7);
    }
  }
}
