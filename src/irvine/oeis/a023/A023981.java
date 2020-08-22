package irvine.oeis.a023;

import irvine.math.z.Z;

/**
 * A023981 Sum of exponents in prime-power factorization of multinomial coefficient M(5n; n,n,n,n,n).
 * @author Sean A. Irvine
 */
public class A023981 extends A023978 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(multinomialOmega(5 * mN, mN, mN, mN, mN, mN));
  }
}

