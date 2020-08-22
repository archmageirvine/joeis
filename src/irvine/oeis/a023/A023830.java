package irvine.oeis.a023;

import irvine.math.z.Z;

/**
 * A023830 Sum of exponents in prime-power factorization of C(4n,n-4).
 * @author Sean A. Irvine
 */
public class A023830 extends A023847 {

  private long mN = 3;

  @Override
  public Z next() {
    return Z.valueOf(binomialOmega(4 * ++mN, mN - 4));
  }
}

