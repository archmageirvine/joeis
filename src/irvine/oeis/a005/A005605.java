package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005605 <code>a(n) = a(n-1) + (-1)^(n-1) * a(n-2)^2</code>.
 * @author Sean A. Irvine
 */
public class A005605 implements Sequence {

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

