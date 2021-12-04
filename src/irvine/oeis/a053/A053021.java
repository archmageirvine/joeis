package irvine.oeis.a053;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a027.A027423;

/**
 * A053021 Number of divisors function applied twice to n!.
 * @author Sean A. Irvine
 */
public class A053021 extends A027423 {

  {
    super.next();
  }

  @Override
  public Z next() {
    return Jaguar.factor(super.next()).sigma0();
  }
}
