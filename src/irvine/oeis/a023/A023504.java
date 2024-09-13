package irvine.oeis.a023;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A023504 Maximum exponent in the prime factorization of prime(n) - 1.
 * @author Sean A. Irvine
 */
public class A023504 extends A000040 {

  @Override
  public Z next() {
    return Z.valueOf(Jaguar.factor(super.next().subtract(1)).maxExponent());
  }
}
