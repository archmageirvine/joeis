package irvine.oeis.a065;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000720;

/**
 * A065309 a(n) = prime(n) - prime(n - pi(n)).
 * @author Sean A. Irvine
 */
public class A065309 extends A000720 {

  @Override
  public Z next() {
    final Z pi = super.next();
    return Functions.PRIME.z(mN).subtract(Functions.PRIME.l(mN.subtract(pi).intValueExact()));
  }
}
