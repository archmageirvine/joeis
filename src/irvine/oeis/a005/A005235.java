package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.a002.A002110;

/**
 * A005235 Fortunate numbers: least m <code>&gt; 1</code> such that m <code>+ prime(n)#</code> is prime, where <code>p#</code> denotes the product of all primes <code>&lt;=</code> p.
 * @author Sean A. Irvine
 */
public class A005235 extends A002110 {

  {
    super.next();
  }

  @Override
  public Z next() {
    final Z pp = super.next();
    Z m = Z.ONE;
    while (true) {
      m = m.add(2);
      if (pp.add(m).isProbablePrime()) {
        return m;
      }
    }
  }
}
