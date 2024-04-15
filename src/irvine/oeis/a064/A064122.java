package irvine.oeis.a064;

import irvine.math.function.Functions;
import irvine.math.z.Z;

/**
 * A064122 Number of divisors of 3^n - 1 that are relatively prime to 3^m - 1 for all 0 &lt; m &lt; n.
 * @author Sean A. Irvine
 */
public class A064122 extends A064079 {

  @Override
  public Z next() {
    return Functions.SIGMA0.z(super.next());
  }
}
