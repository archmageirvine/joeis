package irvine.oeis.a007;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a004.A004394;

/**
 * A007626 Sum of divisors of superabundant numbers (A004394).
 * @author Sean A. Irvine
 */
public class A007626 extends A004394 {

  @Override
  public Z next() {
    return Functions.SIGMA1.z(super.next());
  }
}
