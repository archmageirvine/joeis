package irvine.oeis.a062;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a018.A018252;

/**
 * A062502 Number of prime divisors (with repetition) of the nonprimes (including 1).
 * @author Sean A. Irvine
 */
public class A062502 extends A018252 {

  @Override
  public Z next() {
    return Z.valueOf(Jaguar.factor(super.next()).bigOmega());
  }
}
