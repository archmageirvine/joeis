package irvine.oeis.a080;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a001.A001359;

/**
 * A080699 Product of twin-prime-indexed primes and their upper bound twin prime.
 * @author Sean A. Irvine
 */
public class A080699 extends A001359 {

  @Override
  public Z next() {
    final Z p = super.next();
    return p.add(2).multiply(Functions.PRIME.z(p));
  }
}
