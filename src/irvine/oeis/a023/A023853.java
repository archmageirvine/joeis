package irvine.oeis.a023;

import irvine.math.z.Z;

/**
 * A023853 Sum of exponents in prime-power factorization of binomial(6n, 2n).
 * @author Sean A. Irvine
 */
public class A023853 extends A023847 {

  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(binomialOmega(6 * ++mN, 2 * mN));
  }
}

