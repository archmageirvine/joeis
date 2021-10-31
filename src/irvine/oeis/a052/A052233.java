package irvine.oeis.a052;

import irvine.math.z.Z;

/**
 * A052233 Primes p from A031924 such that A052180(primepi(p)) = 13.
 * @author Sean A. Irvine
 */
public class A052233 extends A052230 {

  private static final Z Z13 = Z.valueOf(13);

  @Override
  protected Z target() {
    return Z13;
  }
}
