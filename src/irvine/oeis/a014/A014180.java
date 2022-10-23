package irvine.oeis.a014;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A014180 Sum_{k = 0..n} binomial(n,k)^3*binomial(n+k,k)^2.
 * @author Sean A. Irvine
 */
public class A014180 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 0; k <= mN; ++k) {
      sum = sum.add(Binomial.binomial(mN, k).pow(3).multiply(Binomial.binomial(mN + k, k).square()));
    }
    return sum;
  }
}
