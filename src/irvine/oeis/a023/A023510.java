package irvine.oeis.a023;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A023510 Greatest exponent in prime-power factorization of prime(n) + 1.
 * @author Sean A. Irvine
 */
public class A023510 extends A000040 {

  @Override
  public Z next() {
    return Z.valueOf(Jaguar.factor(super.next().add(1)).maxExponent());
  }
}
