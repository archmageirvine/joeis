package irvine.oeis.a023;

import irvine.math.z.Z;

/**
 * A023980 Sum of exponents in prime-power factorization of multinomial coefficient <code>M(4n;2n,n,n)</code>.
 * @author Sean A. Irvine
 */
public class A023980 extends A023978 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(multinomialOmega(4 * mN, 2 * mN, mN, mN));
  }
}

