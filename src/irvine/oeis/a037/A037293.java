package irvine.oeis.a037;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A037293 a(n) = Sum_{i=0..2^(n-1)} binomial(2^(n-1), i)^2.
 * @author Sean A. Irvine
 */
public class A037293 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    final long lim = 1L << (mN - 1);
    for (long k = 0; k <= lim; ++k) {
      sum = sum.add(Binomial.binomial(lim, k).square());
    }
    return sum;
  }
}

