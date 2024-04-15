package irvine.oeis.a074;
// manually sigman1/sigma1 at 2023-02-28 22:58

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a006.A006532;

/**
 * A074385 Square root of sum of divisors, when it is a square.
 * @author Georg Fischer
 */
public class A074385 extends A006532 {

  @Override
  public Z next() {
    return Functions.SIGMA.z(super.next()).sqrt();
  }
}
