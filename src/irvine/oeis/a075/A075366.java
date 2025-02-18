package irvine.oeis.a075;

import irvine.math.z.Integers;
import irvine.math.z.Z;

/**
 * A075366 Smallest product (n+1)(n+2)...(n+k) that is divisible by the product of all the primes up to n.
 * @author Sean A. Irvine
 */
public class A075366 extends A075365 {

  @Override
  public Z next() {
    final int k = super.next().intValueExact();
    return Integers.SINGLETON.product(mN + 1, mN + k, Z::valueOf);
  }
}
