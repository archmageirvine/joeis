package irvine.oeis.a029;

import irvine.math.z.Z;
import irvine.oeis.a002.A002034;

/**
 * A029714 <code>a(n) =</code> Sum <code>S(k)</code>, k divides <code>3^n</code>, where S is the Kempner function <code>A002034</code>.
 * @author Sean A. Irvine
 */
public class A029714 extends A002034 {

  private Z mA = Z.ZERO;
  private Z mN = Z.ONE;

  @Override
  public Z next() {
    mA = mA.add(kempner(mN));
    mN = mN.multiply(3);
    return mA;
  }
}
