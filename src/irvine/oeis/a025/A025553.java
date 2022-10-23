package irvine.oeis.a025;

import irvine.math.q.Q;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A025553 a(n) = (Sum_{i=0..n-1} 1/b(i)) * LCM{b(i): i=0..n-1}, where b(i) = C(i,floor(i/2)).
 * @author Sean A. Irvine
 */
public class A025553 extends Sequence1 {

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
