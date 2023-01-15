package irvine.oeis.a061;

import irvine.math.z.Z;
import irvine.oeis.a008.A008836;

/**
 * A061019 Negate primes in factorization of n.
 * @author Sean A. Irvine
 */
public class A061019 extends A008836 {

  @Override
  public Z next() {
    return super.next().multiply(mN);
  }
}

