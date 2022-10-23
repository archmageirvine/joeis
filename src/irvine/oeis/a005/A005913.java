package irvine.oeis.a005;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A005913 a(n) = [ tau*a(n-1) ] + [ tau*a(n-2) ].
 * @author Sean A. Irvine
 */
public class A005913 extends Sequence0 {

  private Z mA = null;
  private Z mB = null;

  @Override
  public Z next() {
    if (mB == null) {
      if (mA == null) {
        mA = Z.ONE;
        return Z.ONE;
      }
      mB = Z.THREE;
    } else {
      final Z t = CR.PHI.multiply(mA).floor().add(CR.PHI.multiply(CR.valueOf(mB)).floor());
      mA = mB;
      mB = t;
    }
    return mB;
  }
}
