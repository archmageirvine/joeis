package irvine.oeis.a023;

import irvine.math.z.Z;

/**
 * A023993 Sum of exponents of primes in multinomial coefficient <code>M(3n; n+2,n-1,n-1)</code>.
 * @author Sean A. Irvine
 */
public class A023993 extends A023978 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(multinomialOmega(3 * mN, mN + 2, mN - 1, mN - 1));
  }
}

