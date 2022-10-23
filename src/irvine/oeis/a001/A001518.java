package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A001518 Bessel polynomial y_n(3).
 * @author Sean A. Irvine
 */
public class A001518 extends Sequence0 {

  private int mN = -9;
  private Z mA = Z.FOUR;
  private Z mB = Z.ONE;

  @Override
  public Z next() {
    mN += 6;
    final Z t = mB.multiply(mN).add(mA);
    mA = mB;
    mB = t;
    return t;
  }
}
