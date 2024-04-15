package irvine.oeis.a064;

import irvine.math.function.Functions;
import irvine.math.z.Z;

/**
 * A064123 Number of divisors of 5^n - 1 that are relatively prime to 5^m - 1 for all 0 &lt; m &lt; n.
 * @author Sean A. Irvine
 */
public class A064123 extends A064081 {

  @Override
  public Z next() {
    return Functions.SIGMA0.z(super.next());
  }
}
