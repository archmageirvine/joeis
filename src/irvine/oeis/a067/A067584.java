package irvine.oeis.a067;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a000.A000396;

/**
 * A067584 Product of divisors of n-th perfect number.
 * @author Sean A. Irvine
 */
public class A067584 extends A000396 {

  @Override
  public Z next() {
    return Jaguar.factor(super.next()).pod();
  }
}
