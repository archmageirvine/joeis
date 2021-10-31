package irvine.oeis.a052;

import irvine.math.z.Z;

/**
 * A052236 Primes p from A031924 such that A052180(primepi(p)) = 29.
 * @author Sean A. Irvine
 */
public class A052236 extends A052230 {

  private static final Z Z29 = Z.valueOf(29);

  @Override
  protected Z target() {
    return Z29;
  }
}
