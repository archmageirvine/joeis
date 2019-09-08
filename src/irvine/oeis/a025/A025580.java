package irvine.oeis.a025;

import irvine.math.q.Q;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A025580 <code>a(n) = (1/1 - 1/(n-1) + ... + d/binomial(n-[ n/2 ],[ n/2 ]))*L</code>, where L <code>= LCM{1, n-1</code>, ..., <code>binomial(n-[ n/2 ],[ n/2 ])}, d = (-1)^n</code>.
 * @author Sean A. Irvine
 */
public class A025580 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z l = Z.ONE;
    Q a = Q.ZERO;
    for (long k = 0; k <= mN / 2; ++k) {
      final Z b = Binomial.binomial(mN - k, k);
      a = a.signedAdd((k & 1) == 0, new Q(Z.ONE, b));
      l = l.lcm(b);
    }
    return a.multiply(l).toZ();
  }
}
