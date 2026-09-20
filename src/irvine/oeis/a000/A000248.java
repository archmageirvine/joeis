package irvine.oeis.a000;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence0;

/**
 * A000248 Expansion of e.g.f. exp(x*exp(x)).
 * @author Sean A. Irvine
 */
public class A000248 extends Sequence0 implements DirectSequence {

  protected int mN = -1;

  @Override
  public Z next() {
    return a(++mN);
  }

  @Override
  public Z a(final Z n) {
    return a(n.longValueExact());
  }

  @Override
  public Z a(final long n) {
    Z sum = Z.ZERO;
    for (int k = 0; k <= n; ++k) {
      sum = sum.add(Binomial.binomial(n, k).multiply(Z.valueOf(n - k).pow(k)));
    }
    return sum;
  }

}

