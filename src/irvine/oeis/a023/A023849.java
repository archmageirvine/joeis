package irvine.oeis.a023;

import irvine.math.z.Z;

/**
 * A023849 Sum of exponents in prime-power factorization of <code>binomial(5n, 2n-2)</code>.
 * @author Sean A. Irvine
 */
public class A023849 extends A023847 {

  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(binomialOmega(5 * ++mN, 2 * mN - 2));
  }
}

