package irvine.oeis.a023;

import irvine.math.z.Z;

/**
 * A023840 Sum of exponents in prime-power factorization of C(5n,n-3).
 * @author Sean A. Irvine
 */
public class A023840 extends A023847 {

  private long mN = 2;

  @Override
  public Z next() {
    return Z.valueOf(binomialOmega(5 * ++mN, mN - 3));
  }
}

