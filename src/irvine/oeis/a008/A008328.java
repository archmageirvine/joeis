package irvine.oeis.a008;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a006.A006093;

/**
 * A008328 Number of divisors of prime(n)-1.
 * @author Sean A. Irvine
 */
public class A008328 extends A006093 {

  @Override
  public Z next() {
    return Functions.SIGMA0.z(super.next());
  }
}


