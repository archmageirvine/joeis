package irvine.oeis.a025;

import irvine.math.q.Q;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A025554 <code>(Sum{d(i)/C(n,i))*LCM{C(n,i)}</code>, where <code>d(i) = (-1)^i, i = 0,1,...,[ n/2 ]</code>.
 * @author Sean A. Irvine
 */
public class A025554 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z l = Z.ONE;
    Q a = Q.ZERO;
    for (long k = 0; k < mN; ++k) {
      final Z b = Binomial.binomial(k, k / 2);
      a = a.signedAdd((k & 1) == 0, new Q(Z.ONE, b));
      l = l.lcm(b);
    }
    return a.multiply(l).toZ();
  }
}
