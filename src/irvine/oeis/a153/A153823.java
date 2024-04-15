package irvine.oeis.a153;
// manually sigman0/sigma0 at 2023-02-28 16:08

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000142;

/**
 * A153823 Number of proper divisors of n!.
 * @author Georg Fischer
 */
public class A153823 extends A000142 {

  @Override
  public Z next() {
    return Functions.SIGMA0.z(super.next()).subtract(1);
  }
}
