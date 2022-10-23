package irvine.oeis.a011;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A011900 a(n) = 6*a(n-1) - a(n-2) - 2 with a(0) = 1, a(1) = 3.
 * @author Sean A. Irvine
 */
public class A011900 extends Sequence0 {

  private Z mA = Z.THREE;
  private Z mB = Z.ONE;

  @Override
  public Z next() {
    final Z t = mB.multiply(6).subtract(mA).subtract(2);
    mA = mB;
    mB = t;
    return t;
  }
}
