package irvine.oeis.a024;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A024420 a(n) = n! * Sum_{j=0..floor(n/2)} (-1)^j/binomial(n,j).
 * @author Sean A. Irvine
 */
public class A024420 extends Sequence0 {

  private Z mF = Z.ONE;
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN > 1) {
      mF = mF.multiply(mN);
    }
    Z sum = Z.ZERO;
    for (int k = 0; k <= mN / 2; ++k) {
      sum = sum.signedAdd((k & 1) == 0, mF.divide(Binomial.binomial(mN, k)));
    }
    return sum;
  }
}
