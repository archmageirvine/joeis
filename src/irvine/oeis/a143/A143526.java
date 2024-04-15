package irvine.oeis.a143;
// manually sigman0/sigma0 at 2023-02-28 16:08

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a005.A005179;

/**
 * A143526 a(n) = the number of divisors of (A005179(n)+1), where A005179(n) is the smallest positive integer with n divisors.
 * @author Georg Fischer
 */
public class A143526 extends A005179 {

  @Override
  public Z next() {
    return Functions.SIGMA0.z(super.next().add(1));
  }
}
