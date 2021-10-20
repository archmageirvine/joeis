package irvine.oeis.a052;

import irvine.math.z.Z;

/**
 * A052074 Squares of primes p^2 with the property that nextprime(p) is a substring of p^2.
 * @author Sean A. Irvine
 */
public class A052074 extends A052073 {

  @Override
  public Z next() {
    return super.next().square();
  }
}

