package irvine.oeis.a025;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A025179.
 * @author Sean A. Irvine
 */
public class A025179 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 0; k <= mN / 2; ++k) {
      sum = sum.add(Binomial.binomial(mN, 2 * k).multiply(Binomial.binomial(2 * k + 1, k + 1)));
    }
    return sum;
  }
}
