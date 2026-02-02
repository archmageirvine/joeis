package irvine.oeis.a001;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence0;

/**
 * A001850 Central Delannoy numbers: a(n) = Sum_{k=0..n} C(n,k)*C(n+k,k).
 * @author Sean A. Irvine
 */
public class A001850 extends Sequence0 implements DirectSequence {

  private int mN = -1;

  @Override
  public Z next() {
    return a(++mN);
  }

  @Override
  public Z a(final Z n) {
    return a(n.intValueExact());
  }

  @Override
  public Z a(final int n) {
    Z s = Z.ZERO;
    for (int k = 0; k <= n; ++k) {
      s = s.add(Binomial.binomial(n, k).multiply(Binomial.binomial(n + k, k)));
    }
    return s;
  }

}
