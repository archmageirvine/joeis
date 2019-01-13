package irvine.oeis.a011;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A011900.
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
