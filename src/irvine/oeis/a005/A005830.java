package irvine.oeis.a005;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005830 <code>a(n) = floor(tau*a(n-1)) + a(n-2)</code> where tau is the golden ratio.
 * @author Sean A. Irvine
 */
public class A005830 implements Sequence {

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
      final Z t = CR.PHI.multiply(mB).floor().add(mA);
      mA = mB;
      mB = t;
    }
    return mB;
  }
}
