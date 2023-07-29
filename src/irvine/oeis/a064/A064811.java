package irvine.oeis.a064;

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A064811 a(n) = Sum_{k=1..n} binomial(prime(n),k).
 * @author Sean A. Irvine
 */
public class A064811 extends A000040 {

  private int mN = 0;

  @Override
  public Z next() {
    final long p = super.next().longValueExact();
    return Integers.SINGLETON.sum(1, ++mN, k -> Binomial.binomial(p, k));
  }
}

