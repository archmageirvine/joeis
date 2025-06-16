package irvine.oeis.a101;
// manually 2025-06-16

import irvine.math.function.Functions;
import irvine.math.z.Z;

/**
 * A101684 Exponent of 2 in denominators of expansion of e.g.f.: exp(-1 + sqrt(1+x)).
 * @author Georg Fischer
 */
public class A101684 extends A101683 {

  @Override
  public Z next() {
    return Functions.VALUATION.z(super.nextQ().den(), 2);
  }
}
