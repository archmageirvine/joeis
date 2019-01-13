package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.a001.A001285;

/**
 * A005681.
 * @author Sean A. Irvine
 */
public class A005681 extends A001285 {

  private int mPrev = super.next().intValueExact();

  @Override
  public Z next() {
    final int t = mPrev;
    mPrev = super.next().intValueExact();
    switch (t * 10 + mPrev) {
      case 11:
        return Z.ONE;
      case 12:
        return Z.TWO;
      case 21:
        return Z.THREE;
      default: // 22
        return Z.FOUR;
    }
  }
}

