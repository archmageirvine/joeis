package irvine.oeis.a049;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A049234 Number of divisors of prime(n) + 2.
 * @author Sean A. Irvine
 */
public class A049234 extends A000040 {

  @Override
  public Z next() {
    return Jaguar.factor(super.next().add(2)).sigma0();
  }
}
