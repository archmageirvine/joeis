package irvine.oeis.a062;
// manually sigma0 at 2023-02-28 13:16

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a053.A053986;

/**
 * A062959 Number of divisors of n^(n!) (A053986).
 * @author Georg Fischer
 */
public class A062959 extends A053986 {

  {
    super.next();
  }

  @Override
  public int getOffset() {
    return 1;
  }

  @Override
  public Z next() {
    return Jaguar.factor(super.next()).sigma0();
  }
}
