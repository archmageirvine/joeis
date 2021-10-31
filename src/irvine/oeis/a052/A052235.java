package irvine.oeis.a052;

import irvine.math.z.Z;

/**
 * A052235 Primes p from A031924 such that A052180(primepi(p)) = 19.
 * @author Sean A. Irvine
 */
public class A052235 extends A052230 {

  private static final Z Z19 = Z.valueOf(19);

  @Override
  protected Z target() {
    return Z19;
  }
}
