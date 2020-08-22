package irvine.oeis.a023;

import irvine.math.z.Z;

/**
 * A023841 Sum of exponents in prime-power factorization of C(5n,n-4).
 * @author Sean A. Irvine
 */
public class A023841 extends A023847 {

  private long mN = 3;

  @Override
  public Z next() {
    return Z.valueOf(binomialOmega(5 * ++mN, mN - 4));
  }
}

