package irvine.oeis.a060;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A060604 a(n) = binomial(prime(n), n) where prime(n) = n-th prime.
 * @author Sean A. Irvine
 */
public class A060604 extends A000040 {

  private long mN = 0;

  @Override
  public Z next() {
    return Binomial.binomial(super.next().longValueExact(), ++mN);
  }
}
