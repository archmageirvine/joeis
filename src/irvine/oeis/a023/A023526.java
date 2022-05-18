package irvine.oeis.a023;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;

/**
 * A023526 Greatest exponent in prime-power factorization of p(n)*p(n-1) + 1.
 * @author Sean A. Irvine
 */
public class A023526 extends A023523 {

  @Override
  public Z next() {
    return Z.valueOf(Jaguar.factor(super.next()).maxExponent());
  }
}
