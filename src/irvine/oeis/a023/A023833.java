package irvine.oeis.a023;

import irvine.math.z.Z;

/**
 * A023833 Sum of exponents in prime-power factorization of C(4n,n+3).
 * @author Sean A. Irvine
 */
public class A023833 extends A023847 {

  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(binomialOmega(4 * ++mN, mN + 3));
  }
}

