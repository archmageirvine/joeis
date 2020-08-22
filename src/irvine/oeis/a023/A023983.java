package irvine.oeis.a023;

import irvine.math.z.Z;

/**
 * A023983 Sum of exponents in prime-power factorization of multinomial coefficient M(5n;2n,2n,n).
 * @author Sean A. Irvine
 */
public class A023983 extends A023978 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(multinomialOmega(5 * mN, 2 * mN, 2 * mN, mN));
  }
}

