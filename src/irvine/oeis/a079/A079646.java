package irvine.oeis.a079;

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A079618.
 * @author Sean A. Irvine
 */
public class A079646 extends A000040 {

  private Z f(final int n) {
    return Integers.SINGLETON.sum(0, n, k -> Binomial.binomial(n, k).multiply(Binomial.binomial(2L * k, k).square()));
  }

  @Override
  public Z next() {
    final Z p = super.next();
    return f(p.intValueExact()).subtract(5).divide(p.multiply(4));
  }
}

