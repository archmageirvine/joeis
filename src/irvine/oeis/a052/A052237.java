package irvine.oeis.a052;

import irvine.math.z.Z;

/**
 * A052237 Primes p from A031924 such that A052180(primepi(p)) = 31.
 * @author Sean A. Irvine
 */
public class A052237 extends A052230 {

  private static final Z Z31 = Z.valueOf(31);

  @Override
  protected Z target() {
    return Z31;
  }
}
