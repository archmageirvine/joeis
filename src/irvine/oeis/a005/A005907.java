package irvine.oeis.a005;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005907 <code>a(n) = [ tau*a(n-2) ] + a(n-1)</code>.
 * @author Sean A. Irvine
 */
public class A005907 implements Sequence {

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
      final Z t = CR.PHI.multiply(mA).floor().add(mB);
      mA = mB;
      mB = t;
    }
    return mB;
  }
}
