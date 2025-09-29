package irvine.oeis.a080;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a006.A006512;

/**
 * A080701 Product of upper bound twin-prime-indexed primes and their upper bound twin prime.
 * @author Sean A. Irvine
 */
public class A080701 extends A006512 {

  @Override
  public Z next() {
    final Z p = super.next();
    return p.multiply(Functions.PRIME.z(p));
  }
}
