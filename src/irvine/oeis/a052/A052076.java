package irvine.oeis.a052;

import irvine.math.z.Z;

/**
 * A052076 List of cubes p^3 of primes with property that next prime after p is a substring of p^3.
 * @author Sean A. Irvine
 */
public class A052076 extends A052075 {

  @Override
  public Z next() {
    return super.next().pow(3);
  }
}

