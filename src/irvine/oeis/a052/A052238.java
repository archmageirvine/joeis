package irvine.oeis.a052;

import irvine.math.z.Z;

/**
 * A052238 Primes p from A031924 such that A052180(p) = 23.
 * @author Sean A. Irvine
 */
public class A052238 extends A052230 {

  private static final Z Z23 = Z.valueOf(23);

  @Override
  protected Z target() {
    return Z23;
  }
}
