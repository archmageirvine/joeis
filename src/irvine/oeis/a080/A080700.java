package irvine.oeis.a080;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a001.A001359;

/**
 * A080700 Product of upper bound twin-prime-indexed primes and their lower bound twin prime.
 * @author Sean A. Irvine
 */
public class A080700 extends A001359 {

  @Override
  public Z next() {
    final Z p = super.next();
    return p.multiply(Functions.PRIME.z(p.add(2)));
  }
}
