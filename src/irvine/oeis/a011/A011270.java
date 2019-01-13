package irvine.oeis.a011;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A011270.
 * @author Sean A. Irvine
 */
public class A011270 implements Sequence {

  private long mN = -2;

  @Override
  public Z next() {
    if (++mN < 1) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    for (long k = 0; k <= mN; ++k) {
      sum = sum.add(Binomial.binomial(mN + k + 1, mN + 1).multiply(Binomial.binomial(mN + k + 2, mN - k)));
    }
    return sum.multiply2().divide(mN + 2);
  }
}

