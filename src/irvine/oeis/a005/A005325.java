package irvine.oeis.a005;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005325.
 * @author Sean A. Irvine
 */
public class A005325 implements Sequence {

  private long mN = 4;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = (mN - 4) / 2; k <= mN + 1; ++k) {
      sum = sum.add(Binomial.binomial(k, 2 * k - mN + 5).multiply(Binomial.binomial(mN + 1, k)));
    }
    return sum.multiply(6).divide(mN + 1);
  }
}

