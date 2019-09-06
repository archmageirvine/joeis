package irvine.oeis.a025;

import irvine.math.q.Q;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A025553 <code>(Sum{1/C(n,i))*LCM{C(n,i)}, i = 0,1,...,[ n/2 ]</code>.
 * @author Sean A. Irvine
 */
public class A025553 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z l = Z.ONE;
    Q a = Q.ZERO;
    for (long k = 0; k < mN; ++k) {
      final Z b = Binomial.binomial(k, k / 2);
      a = a.add(new Q(Z.ONE, b));
      l = l.lcm(b);
    }
    return a.multiply(l).toZ();
  }
}
