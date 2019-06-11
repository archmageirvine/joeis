package irvine.oeis.a023;

import irvine.math.z.Z;

/**
 * A023846 Sum of exponents in prime-power factorization of <code>binomial(5n, n+4)</code>.
 * @author Sean A. Irvine
 */
public class A023846 extends A023847 {

  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(binomialOmega(5 * ++mN, mN + 4));
  }
}

