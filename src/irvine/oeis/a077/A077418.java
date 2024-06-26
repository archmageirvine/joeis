package irvine.oeis.a077;
// manually sigman0/sigma0 at 2023-02-28 21:57

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000045;

/**
 * A077418 Number of divisors of Fibonacci(n+2)-1.
 * @author Georg Fischer
 */
public class A077418 extends A000045 {

  {
    setOffset(1);
    super.next();
    super.next();
    super.next();
  }

  @Override
  public Z next() {
    return Functions.SIGMA0.z(super.next().subtract(1));
  }
}
