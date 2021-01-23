package irvine.oeis.a023;

import irvine.math.z.Z;

/**
 * A023984 Sum of exponents in prime-power factorization of multinomial coefficient M(6n; n,n,n,n,n,n).
 * @author Sean A. Irvine
 */
public class A023984 extends A023978 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(multinomialOmega(6 * mN, mN, mN, mN, mN, mN, mN));
  }
}

