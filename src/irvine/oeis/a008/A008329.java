package irvine.oeis.a008;

import irvine.math.function.Functions;
import irvine.math.z.Z;

/**
 * A008329 Number of divisors of p+1, p prime.
 * @author Sean A. Irvine
 */
public class A008329 extends A008864 {

  @Override
  public Z next() {
    return Functions.SIGMA0.z(super.next());
  }
}


