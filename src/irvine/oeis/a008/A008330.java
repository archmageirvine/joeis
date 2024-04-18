package irvine.oeis.a008;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a006.A006093;

/**
 * A008330 phi(p-1), as p runs through the primes.
 * @author Sean A. Irvine
 */
public class A008330 extends A006093 {

  @Override
  public Z next() {
    return Functions.PHI.z(super.next());
  }
}


