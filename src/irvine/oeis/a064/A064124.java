package irvine.oeis.a064;

import irvine.math.function.Functions;
import irvine.math.z.Z;

/**
 * A064124 Number of divisors of 7^n - 1 that are relatively prime to 7^m - 1 for all 0 &lt; m &lt; n.
 * @author Sean A. Irvine
 */
public class A064124 extends A064083 {

  @Override
  public Z next() {
    return Functions.SIGMA0.z(super.next());
  }
}
