package irvine.oeis.a202;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A202327 Triangle T(n,k) = coefficient of x^n in expansion of [(-1-x+sqrt(1+2x+5x^2))/2]^k = sum(n&gt;=k, T(n,k) x^n).
 * @author Sean A. Irvine
 */
public class A202327 implements Sequence {

  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    Z sum = Z.ZERO;
    for (long j = 0; j <= mN; ++j) {
      sum = sum.signedAdd(((j - mM) & 1) == 0, Binomial.binomial(j, 2 * j - mN - mM).multiply(Binomial.binomial(mN, j)));
    }
    return sum.multiply(mM).divide(mN);
  }
}

