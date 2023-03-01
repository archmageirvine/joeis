package irvine.oeis.a153;
// manually sigman0/sigma0 at 2023-02-28 16:08

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a000.A000142;

/**
 * A153823 Number of proper divisors of n!.
 * @author Georg Fischer
 */
public class A153823 extends A000142 {

  @Override
  public Z next() {
    return Jaguar.factor(super.next()).sigma0().subtract(1);
  }
}
