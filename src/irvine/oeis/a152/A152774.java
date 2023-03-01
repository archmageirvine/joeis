package irvine.oeis.a152;
// manually sigman0/sigma0 at 2023-02-28 16:08

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a000.A000045;

/**
 * A152774 Number of proper divisors of the Fibonacci number A000045(n).
 * @author Georg Fischer
 */
public class A152774 extends A000045 {

  {
    super.next();
  }

  @Override
  public Z next() {
    return Jaguar.factor(super.next()).sigma0().subtract(1);
  }
}
