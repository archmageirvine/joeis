package irvine.oeis.a023;

import irvine.math.z.Z;

/**
 * A023825 Sum of exponents in prime-power factorization of <code>C(3n,n+3)</code>.
 * @author Sean A. Irvine
 */
public class A023825 extends A023847 {

  private long mN = 1;

  @Override
  public Z next() {
    return Z.valueOf(binomialOmega(3 * ++mN, mN + 3));
  }
}

