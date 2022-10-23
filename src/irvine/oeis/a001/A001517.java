package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A001517 Bessel polynomials y_n(x) (see A001498) evaluated at 2.
 * @author Sean A. Irvine
 */
public class A001517 extends Sequence0 {

  private int mN = -6;
  private Z mA = Z.THREE;
  private Z mB = Z.ONE;

  @Override
  public Z next() {
    mN += 4;
    final Z t = mB.multiply(mN).add(mA);
    mA = mB;
    mB = t;
    return t;
  }
}
