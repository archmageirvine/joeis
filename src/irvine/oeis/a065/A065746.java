package irvine.oeis.a065;
// manually sigma0 at 2023-02-28 13:16

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a025.A025475;

/**
 * A065746 Number of divisors of squares of all true powers of primes: A000005[A025475(n)^2].
 * @author Georg Fischer
 */
public class A065746 extends A025475 {

  {
    super.next();
  }

  @Override
  public Z next() {
    return Functions.SIGMA0.z(super.next().square());
  }
}
