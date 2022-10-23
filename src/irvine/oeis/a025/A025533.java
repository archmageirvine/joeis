package irvine.oeis.a025;

import irvine.math.q.Q;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A025533 a(n) = (1/C(n,0) + 1/C(n,1) + ... + 1/C(n,n))*L, where L = LCM{C(n,0), C(n,1),..., C(n,n)}..
 * @author Sean A. Irvine
 */
public class A025533 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z l = Z.ONE;
    Q a = Q.ZERO;
    for (long k = 0; k <= mN; ++k) {
      final Z b = Binomial.binomial(mN, k);
      l = l.lcm(b);
      a = a.add(new Q(Z.ONE, b));
    }
    return a.multiply(l).toZ();
  }
}
