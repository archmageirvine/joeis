package irvine.oeis.a005;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005191 Central pentanomial coefficients: largest coefficient of (1 + x + ... + x^4)^n.
 * @author Sean A. Irvine
 */
public class A005191 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 0; k <= 2 * mN / 5; ++k) {
      sum = sum.add(Binomial.binomial(mN, k).multiply(Binomial.binomial(-mN, 2 * mN - 5 * k)));
    }
    return sum;
  }
}

