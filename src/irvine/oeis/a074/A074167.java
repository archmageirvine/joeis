package irvine.oeis.a074;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A074167 Product of prime divisors of composite numbers between consecutive primes.
 * @author Sean A. Irvine
 */
public class A074167 extends A000040 {

  private long mP = super.next().longValue();

  @Override
  public Z next() {
    final long q = mP;
    mP = super.next().longValueExact();
    Z r = Z.ONE;
    for (long k = q + 1; k < mP; ++k) {
      r = r.multiply(Jaguar.factor(k).squareFreeKernel());
    }
    return r;
  }
}
