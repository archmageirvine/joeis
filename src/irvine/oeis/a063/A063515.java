package irvine.oeis.a063;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a003.A003261;

/**
 * A063515 Sum of divisors of Woodall (or Riesel) numbers; sigma(A003261(n)); sigma(n*2^n - 1).
 * @author Sean A. Irvine
 */
public class A063515 extends A003261 {

  @Override
  public Z next() {
    return Jaguar.factor(super.next()).sigma();
  }
}
