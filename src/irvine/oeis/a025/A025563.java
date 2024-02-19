package irvine.oeis.a025;

import irvine.math.q.Q;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A025563 a(n) = (1/1 + 1/(n-1) + ... + 1/C(n-[ n/2 ],[ n/2 ]))*L, where L = LCM{1, n-1, ..., C(n-[ n/2 ],[ n/2 ])}.
 * @author Sean A. Irvine
 */
public class A025563 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z l = Z.ONE;
    Q a = Q.ZERO;
    for (long k = 0; k <= mN / 2; ++k) {
      final Z b = Binomial.binomial(mN - k, k);
      a = a.add(new Q(Z.ONE, b));
      l = l.lcm(b);
    }
    return a.multiply(l).toZ();
  }
}
