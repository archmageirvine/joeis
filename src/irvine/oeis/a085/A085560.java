package irvine.oeis.a085;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A085560 a(0) = 1, a(1)=3, a(n) = floor((e + 1/e)*a(n-1) - a(n-2)).
 * @author Sean A. Irvine
 */
public class A085560 extends Sequence0 {

  private static final CR C = CR.E.add(CR.E.inverse());
  private Z mA = Z.ZERO;
  private Z mB = null;

  @Override
  public Z next() {
    if (mB == null) {
      mB = Z.ONE;
    } else {
      final Z t = C.multiply(mB).subtract(mA).floor();
      mA = mB;
      mB = t;
    }
    return mB;
  }
}
