package irvine.oeis.a062;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a000.A000142;

/**
 * A062349 a(n) = n! / (number of prime divisors of n, counted with multiplicity).
 * @author Sean A. Irvine
 */
public class A062349 extends A000142 {

  {
    super.next();
    super.next();
    setOffset(2);
  }

  @Override
  public Z next() {
    return super.next().divide(Jaguar.factor(mN).bigOmega());
  }
}
