package irvine.oeis.a058;

import irvine.math.z.Z;

/**
 * A058078 Greatest common divisor of two binomial coefficients formed from consecutive primes: a(n) = gcd(C(prime(n+2), prime(n+1)), C(prime(n+1), prime(n))).
 * @author Sean A. Irvine
 */
public class A058078 extends A058077 {

  private Z mT = super.next();

  @Override
  public Z next() {
    final Z t = mT;
    mT = super.next();
    return mT.gcd(t);
  }
}

