package irvine.oeis.a049;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a065.A065091;

/**
 * A049238 a(n) is the number of divisors of prime(n) - 2.
 * @author Sean A. Irvine
 */
public class A049238 extends A065091 {

  {
    setOffset(2);
  }

  @Override
  public Z next() {
    return Functions.SIGMA0.z(super.next().subtract(2));
  }
}
