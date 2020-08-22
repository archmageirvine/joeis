package irvine.oeis.a023;

import irvine.math.z.Z;

/**
 * A023985 Sum of exponents in prime-power factorization of multinomial coefficient M(6n,2n,2n,2n).
 * @author Sean A. Irvine
 */
public class A023985 extends A023978 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(multinomialOmega(6 * mN, 2 * mN, 2 * mN, 2 * mN));
  }
}

