package irvine.oeis.a091;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a000.A000040;

/**
 * A091282 Exponent of 2 in prime(n)^2 - 1.
 * a(n) = valuation(prime(n)^2-1, 2);
 * @author Georg Fischer
 */
public class A091282 extends A000040 {

  @Override
  public Z next() {
    return Z.valueOf(ZUtils.valuation(Z.TWO, super.next().square().subtract(1)));
  }
}
