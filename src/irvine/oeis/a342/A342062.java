package irvine.oeis.a342;
// manually sigman0/sigma0 at 2023-02-28 16:08

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A342062 a(n) is the number of divisors of prime(n)^8 - 1.
 * @author Georg Fischer
 */
public class A342062 extends A000040 {

  @Override
  public Z next() {
    return Functions.SIGMA0.z(super.next().pow(8).subtract(1));
  }
}
