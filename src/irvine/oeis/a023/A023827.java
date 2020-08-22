package irvine.oeis.a023;

import irvine.math.z.Z;

/**
 * A023827 Sum of exponents in prime-power factorization of C(4n,n-1).
 * @author Sean A. Irvine
 */
public class A023827 extends A023847 {

  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(binomialOmega(4 * ++mN, mN - 1));
  }
}

