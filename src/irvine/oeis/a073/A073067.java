package irvine.oeis.a073;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A073067 Minimum value of abs(prime(n)-k*tau(k)) for k&gt;0.
 * @author Sean A. Irvine
 */
public class A073067 extends A000040 {

  @Override
  public Z next() {
    final Z p = super.next();
    Z min = p;
    for (long k = 1; k <= p.longValueExact(); ++k) {
      min = min.min(p.subtract(Functions.SIGMA0.z(k).multiply(k)).abs());
    }
    return min;
  }
}
