package irvine.oeis.a025;

import irvine.math.q.Q;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A025536 <code>a(n) = (1/C(n,0) - 1/C(n,1) + ... + d/C(n,k))*L</code>, where d <code>= (-1)^k,k = [ n/2 ], L = LCM{C(n,0), C(n,1),..., C(n,n)}</code>.
 * @author Sean A. Irvine
 */
public class A025536 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z l = Z.ONE;
    Q a = Q.ZERO;
    for (long k = 0; k <= mN; ++k) {
      final Z b = Binomial.binomial(mN, k);
      l = l.lcm(b);
      if (k <= mN / 2) {
        a = a.signedAdd((k & 1) == 0, new Q(Z.ONE, b));
      }
    }
    return a.multiply(l).toZ();
  }
}
