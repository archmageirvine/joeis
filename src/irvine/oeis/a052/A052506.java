package irvine.oeis.a052;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A052506 Expansion of e.g.f. exp(x*exp(x)-x).
 * @author Sean A. Irvine
 */
public class A052506 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int k = 0; k <= mN; ++k) {
      sum = sum.add(Binomial.binomial(mN, k).multiply(Z.valueOf(mN - k - 1).pow(k)));
    }
    return sum;
  }
}

