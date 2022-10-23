package irvine.oeis.a005;

import irvine.math.q.Q;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A005364 Hoggatt sequence with parameter d=6.
 * @author Sean A. Irvine
 */
public class A005364 extends Sequence0 {

  private long mN = -1;

  protected Z hoggatt(final long d, final long m) {
    Z sum = Z.ONE;
    for (long h = 0; h < m; ++h) {
      Q p = Q.ONE;
      for (long k = 0; k <= h; ++k) {
        p = p.multiply(new Q(Binomial.binomial(m + d - 1 - k, d), Binomial.binomial(d + k, d)));
      }
      sum = sum.add(p.toZ());
    }
    return sum;
  }

  @Override
  public Z next() {
    return hoggatt(6, ++mN);
  }
}
