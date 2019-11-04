package irvine.oeis.a005;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005834 <code>a(n) = floor( tau*a(n-2) ) + a(n-1)</code> where tau is the golden ratio.
 * @author Sean A. Irvine
 */
public class A005834 implements Sequence {

  private Z mA = null;
  private Z mB = null;

  @Override
  public Z next() {
    if (mB == null) {
      if (mA == null) {
        mA = Z.ZERO;
        return Z.ZERO;
      }
      mB = Z.TWO;
    } else {
      final Z t = CR.PHI.multiply(mA).floor().add(mB);
      mA = mB;
      mB = t;
    }
    return mB;
  }
}
