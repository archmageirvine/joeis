package irvine.oeis.a064;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000142;

/**
 * A064145 a(n) = tau(n!-1) or number of divisors of n!-1.
 * @author Sean A. Irvine
 */
public class A064145 extends A000142 {

  {
    super.next();
    super.next();
    setOffset(2);
  }

  @Override
  public Z next() {
    return Functions.SIGMA0.z(super.next().subtract(1));
  }
}
