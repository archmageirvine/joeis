package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A004146 Alternate Lucas numbers - 2.
 * @author Sean A. Irvine
 */
public class A004146 extends Sequence0 {

  private Z mA = Z.FIVE;
  private Z mB = Z.ONE;

  @Override
  public Z next() {
    final Z t = mB.multiply(3).subtract(mA).add(2);
    mA = mB;
    mB = t;
    return t;
  }
}
