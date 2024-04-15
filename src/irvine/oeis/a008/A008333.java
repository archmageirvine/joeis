package irvine.oeis.a008;

import irvine.math.function.Functions;
import irvine.math.z.Z;

/**
 * A008333 Sum of divisors of p+1, p prime.
 * @author Sean A. Irvine
 */
public class A008333 extends A008864 {

  @Override
  public Z next() {
    return Functions.SIGMA.z(super.next());
  }
}


