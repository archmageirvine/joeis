package irvine.oeis.a052;

import irvine.math.z.Z;

/**
 * A052234 Primes p from A031924 such that A052180(primepi(p)) = 17.
 * @author Sean A. Irvine
 */
public class A052234 extends A052230 {

  private static final Z Z17 = Z.valueOf(17);

  @Override
  protected Z target() {
    return Z17;
  }
}
