package irvine.oeis.a005;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.a000.A000364;

/**
 * A005800 Generalized Euler numbers of type <code>3^2n</code>.
 * @author Sean A. Irvine
 */
public class A005800 extends A000364 {

  private Z mA = Z.ONE;
  private int mN = -1;

  @Override
  public Z next() {
    super.next();
    super.next();
    super.next();
    if (++mN > 0) {
      mA = mA.multiply(36);
    }
    Z sum = Z.ZERO;
    for (int k = 0; k <= 2 * mN; ++k) {
      sum = sum.add(Binomial.binomial(2 * mN, k).multiply(mA364.get(mN + k)));
    }
    return sum.divide(mA);
  }
}
