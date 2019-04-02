package irvine.oeis.a005;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005909 a(n) = [ tau*a(n-1) ] + [ tau*a(n-2) ].
 * @author Sean A. Irvine
 */
public class A005909 implements Sequence {

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
      final Z t = CR.PHI.multiply(CR.valueOf(mA)).floor(32).add(CR.PHI.multiply(CR.valueOf(mB)).floor(32));
      mA = mB;
      mB = t;
    }
    return mB;
  }
}
