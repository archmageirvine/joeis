package irvine.oeis.a023;

import irvine.math.z.Z;

/**
 * A023854 Sum of exponents in prime-power factorization of <code>binomial(6n, 3n)</code>.
 * @author Sean A. Irvine
 */
public class A023854 extends A023847 {

  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(binomialOmega(6 * ++mN, 3 * mN));
  }
}

