package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000194 n appears 2n times, for n &gt;= 1; also nearest integer to square root of n.
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
      if (mCountDown.isZero()) {
        mN = mN.add(1);
        mCountDown = mN.multiply2();
      }
      mCountDown = mCountDown.subtract(Z.ONE);
    }
    return mN;
  }
}

