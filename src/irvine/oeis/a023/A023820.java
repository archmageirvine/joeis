package irvine.oeis.a023;

import irvine.math.z.Z;

/**
 * A023820 Sum of exponents in prime-power factorization of C(3n,n-1).
 * @author Sean A. Irvine
 */
public class A023820 extends A023847 {

  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(binomialOmega(3 * ++mN, mN - 1));
  }
}

