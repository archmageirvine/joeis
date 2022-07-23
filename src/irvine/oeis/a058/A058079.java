package irvine.oeis.a058;

import irvine.math.z.Z;

/**
 * A058079 a(n) = p3, where {p1,p2,p3} are 3 consecutive primes with increasing order such that gcd(C(p3,p2), C(p2,p1)) = 1, where C is the binomial coefficient.
 * @author Sean A. Irvine
 */
public class A058079 extends A058078 {

  @Override
  public Z next() {
    while (!super.next().equals(Z.ONE)) {
      // do nothing
    }
    return mP;
  }
}

