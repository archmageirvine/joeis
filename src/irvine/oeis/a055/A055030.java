package irvine.oeis.a055;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A055030 (Sum(m^(p-1),m=1..p-1)+1)/p as p runs through the primes.
 * @author Sean A. Irvine
 */
public class A055030 extends A000040 {

  @Override
  public Z next() {
    final Z pp = super.next();
    final long p = pp.longValueExact();
    Z sum = Z.ONE;
    for (long k = 1; k < p; ++k) {
      sum = sum.add(Z.valueOf(k).pow(p - 1));
    }
    return sum.divide(pp);
  }
}
