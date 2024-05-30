package irvine.oeis.a091;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A091282 Exponent of 2 in prime(n)^2 - 1.
 * a(n) = valuation(prime(n)^2-1, 2);
 * @author Georg Fischer
 */
public class A091282 extends A000040 {

  @Override
  public Z next() {
    return Functions.VALUATION.z(super.next().square().subtract(1), Z.TWO);
  }
}
