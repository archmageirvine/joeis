package irvine.oeis.a011;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A011365 Reciprocal of g.f. for A007863.
 * @author Sean A. Irvine
 */
public class A011365 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    if (++mN < 2) {
      return mN == 0 ? Z.ONE : Z.valueOf(-2);
    }
    Z sum = Z.ZERO;
    for (long k = 0; k <= mN; ++k) {
      sum = sum.add(Binomial.binomial(mN + k - 2, mN - 2).multiply(Binomial.binomial(mN + k - 1, mN - k)));
    }
    return sum.divide(mN - 1).negate();
  }
}
