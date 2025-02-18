package irvine.oeis.a075;

import irvine.math.z.Z;

/**
 * A075367 Smallest value of lcm(n+1, n+2, ..., n+k) (for k &gt;= 0) that is divisible by the product of all the primes up to n.
 * @author Sean A. Irvine
 */
public class A075367 extends A075365 {

  @Override
  public Z next() {
    final int k = super.next().intValueExact();
    Z lcm = Z.ONE;
    for (int j = 1; j <= k; ++j) {
      lcm = lcm.lcm(mN + j);
    }
    return lcm;
  }
}
