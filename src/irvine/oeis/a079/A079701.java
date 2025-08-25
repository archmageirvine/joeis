package irvine.oeis.a079;

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A079701 A congruence property: a(n) = (A026375(p)-3)/(2*p) where p is the n-th prime.
 * @author Sean A. Irvine
 */
public class A079701 extends A000040 {

  @Override
  public Z next() {
    final Z p = super.next();
    return Integers.SINGLETON.sum(0, p.intValueExact(), k -> Binomial.binomial(p, k).multiply(Binomial.binomial(2L * k, k))).subtract(3).divide(p).divide2();
  }
}

