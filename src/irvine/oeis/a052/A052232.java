package irvine.oeis.a052;

import irvine.math.z.Z;

/**
 * A052232 Primes p from A031924 such that A052180(primepi(p)) = 11.
 * @author Sean A. Irvine
 */
public class A052232 extends A052230 {

  private static final Z Z11 = Z.valueOf(11);

  @Override
  protected Z target() {
    return Z11;
  }
}
