package irvine.oeis.a052;

import irvine.math.z.Z;

/**
 * A052231 Primes p from A031924 such that A052180(primepi(p)) = 7.
 * @author Sean A. Irvine
 */
public class A052231 extends A052230 {

  @Override
  protected Z target() {
    return Z.SEVEN;
  }
}
