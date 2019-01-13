package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007452.
 * @author Sean A. Irvine
 */
public class A007452 implements Sequence {

  private long mN = -1;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    if (++mN > 1) {
      mF = mF.multiply(mN);
      if ((mN & 1) == 0) {
        mF = mF.divide2();
      }
    }
    if ((mN & 3) == 2) {
      return Z.ZERO;
    }
    final long r = mN & 7;
    return mF.multiply(r == 1 || r == 4 || r == 7 ? -1 : 1);
  }
}

