package irvine.oeis.a005;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.a000.A000364;

/**
 * A005799.
 * @author Sean A. Irvine
 */
public class A005799 extends A000364 {

  @Override
  public Z next() {
    super.next();
    Z sum = Z.ZERO;
    for (int k = 0; k <= mN; ++k) {
      sum = sum.add(Binomial.binomial(mN, k).multiply(mA364.get(k)));
    }
    return sum.shiftRight(mN);
  }
}
