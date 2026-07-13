package irvine.oeis.a085;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A085839 a(0)=1, a(1)=3, a(n) = floor((Pi + 1/Pi)*a(n-1) - a(n-2)).
 * @author Sean A. Irvine
 */
public class A085839 extends Sequence0 {

  private static final CR C = CR.PI.add(CR.PI.inverse());
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
      return Z.THREE;
    }
    final Z t = C.multiply(mB).subtract(mA).floor();
    mA = mB;
    mB = t;
    return t;
  }
}
