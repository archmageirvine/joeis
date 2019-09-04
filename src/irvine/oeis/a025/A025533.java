package irvine.oeis.a025;

import irvine.math.q.Q;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A025533 <code>a(n) = (1/C(n,0) + 1/C(n,1) + ... + 1/C(n,n))*L</code>, where L <code>= LCM{C(n,0), C(n,1),..., C(n,n)}.</code>.
 * @author Sean A. Irvine
 */
public class A025533 implements Sequence {

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
