package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A008486 Expansion of (1 + x + x^2)/(1 - x)^2.
 * @author Sean A. Irvine
 */
public class A008486 extends Sequence0 {

  private Z mN = Z.valueOf(-3);

  @Override
  public Z next() {
    mN = mN.add(3);
    return mN.signum() > 0 ? mN : Z.ONE;
  }
}
