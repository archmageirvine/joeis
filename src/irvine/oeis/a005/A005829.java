package irvine.oeis.a005;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005829 <code>a(n) = [ tau*a(n-1) ] + a(n-2)</code>.
 * @author Sean A. Irvine
 */
public class A005829 implements Sequence {

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
      final Z t = CR.PHI.multiply(mB).floor().add(mA);
      mA = mB;
      mB = t;
    }
    return mB;
  }
}
