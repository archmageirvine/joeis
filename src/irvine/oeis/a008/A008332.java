package irvine.oeis.a008;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a006.A006093;

/**
 * A008332 Sum of divisors of p-1, p prime.
 * @author Sean A. Irvine
 */
public class A008332 extends A006093 {

  @Override
  public Z next() {
    return Functions.SIGMA.z(super.next());
  }
}


