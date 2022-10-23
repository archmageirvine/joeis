package irvine.oeis.a005;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A005261 a(n) = Sum_{k = 0..n} C(n,k)^5.
 * @author Sean A. Irvine
 */
public class A005261 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 0; k <= mN; ++k) {
      sum = sum.add(Binomial.binomial(mN, k).pow(5));
    }
    return sum;
  }
}

