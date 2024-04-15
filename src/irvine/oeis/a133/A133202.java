package irvine.oeis.a133;
// manually sigman0/sigma0 at 2023-02-28 21:57

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000594;

/**
 * A133202 Number of divisors of the absolute value of Ramanujan tau numbers.
 * @author Georg Fischer
 */
public class A133202 extends A000594 {

  @Override
  public Z next() {
    return Functions.SIGMA0.z(super.next().abs());
  }
}
