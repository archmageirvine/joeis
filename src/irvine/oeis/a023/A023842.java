package irvine.oeis.a023;

import irvine.math.z.Z;

/**
 * A023842 Sum of exponents in prime-power factorization of C(5n,n-5).
 * @author Sean A. Irvine
 */
public class A023842 extends A023847 {

  private long mN = 4;

  @Override
  public Z next() {
    return Z.valueOf(binomialOmega(5 * ++mN, mN - 5));
  }
}

