package irvine.oeis.a005;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A005821 a(n) = floor(tau*a(n-1)) + a(n-2) with a(0)=0 and a(1)=1.
 * @author Sean A. Irvine
 */
public class A005821 extends Sequence0 {

  private Z mA = null;
  private Z mB = null;

  @Override
  public Z next() {
    if (mB == null) {
      if (mA == null) {
        mA = Z.ZERO;
        return Z.ZERO;
      }
      mB = Z.ONE;
    } else {
      final Z t = CR.PHI.multiply(mB).floor().add(mA);
      mA = mB;
      mB = t;
    }
    return mB;
  }
}
