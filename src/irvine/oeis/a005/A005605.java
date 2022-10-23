package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A005605 a(n) = a(n-1) + (-1)^(n-1) * a(n-2)^2 for n &gt;= 2 with a(0) = 0 and a(1) = 1.
 * @author Sean A. Irvine
 */
public class A005605 extends Sequence0 {

  private Z mA = null;
  private Z mB = null;
  private boolean mSign = true;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ZERO;
      return Z.ZERO;
    } else if (mB == null) {
      mB = Z.ONE;
    } else {
      mSign = !mSign;
      final Z t = mB.signedAdd(mSign, mA.square());
      mA = mB;
      mB = t;
    }
    return mB;
  }
}

