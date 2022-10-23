package irvine.oeis.a005;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A005908 a(n) = floor( phi*a(n-1) ) + floor( phi*a(n-2) ), where phi is the golden ratio.
 * @author Sean A. Irvine
 */
public class A005908 extends Sequence0 {

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
      final Z t = CR.PHI.multiply(mA).floor().add(CR.PHI.multiply(CR.valueOf(mB)).floor());
      mA = mB;
      mB = t;
    }
    return mB;
  }
}
