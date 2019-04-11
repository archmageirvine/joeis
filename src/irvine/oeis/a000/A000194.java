package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000194 n appears <code>2n</code> times, for <code>n &gt;= 1</code>; also nearest integer to square root of n.
 * @author Sean A. Irvine
 */
public class A000194 implements Sequence {

  private Z mN = null;
  private Z mCountDown = Z.ZERO;

  @Override
  public Z next() {
    if (mN == null) {
      mN = Z.ZERO;
    } else {
      if (Z.ZERO.equals(mCountDown)) {
        mN = mN.add(1);
        mCountDown = mN.multiply2();
      }
      mCountDown = mCountDown.subtract(Z.ONE);
    }
    return mN;
  }
}

