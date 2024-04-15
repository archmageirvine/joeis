package irvine.oeis.a053;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a007.A007416;

/**
 * A053212 Number of divisors of the minimal numbers (A007416).
 * @author Sean A. Irvine
 */
public class A053212 extends A007416 {

  @Override
  public Z next() {
    return Functions.SIGMA0.z(super.next());
  }
}
