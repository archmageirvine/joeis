package irvine.oeis.a011;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A011900 <code>a(n) = 6*a(n-1) - a(n-2) - 2</code> with <code>a(0) = 1, a(1) = 3</code>.
 * @author Sean A. Irvine
 */
public class A011900 implements Sequence {

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
