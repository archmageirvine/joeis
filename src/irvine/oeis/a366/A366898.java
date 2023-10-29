package irvine.oeis.a366;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a003.A003261;

/**
 * A366898 Number of divisors of n*2^n - 1, the Woodall (or Riesel) numbers.
 * @author Sean A. Irvine
 */
public class A366898 extends A003261 {

  @Override
  public Z next() {
    return Jaguar.factor(super.next()).sigma0();
  }
}
