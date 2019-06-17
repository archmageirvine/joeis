package irvine.oeis.a023;

import irvine.math.z.Z;

/**
 * A023979 Sum of exponents in prime-power factorization of multinomial coefficient <code>M(4n; n,n,n,n)</code>.
 * @author Sean A. Irvine
 */
public class A023979 extends A023978 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(multinomialOmega(4 * mN, mN, mN, mN, mN));
  }
}

