package irvine.oeis.a023;

import irvine.math.z.Z;

/**
 * A023992 Sum of exponents of primes in multinomial coefficient M(4n; n+2,2n,n-2).
 * @author Sean A. Irvine
 */
public class A023992 extends A023978 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(multinomialOmega(4 * mN, mN + 2, 2 * mN, mN - 2));
  }
}

