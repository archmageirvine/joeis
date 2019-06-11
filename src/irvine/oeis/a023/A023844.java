package irvine.oeis.a023;

import irvine.math.z.Z;

/**
 * A023844 Sum of exponents in prime-power factorization of <code>C(5n,n+2)</code>.
 * @author Sean A. Irvine
 */
public class A023844 extends A023847 {

  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(binomialOmega(5 * ++mN, mN + 2));
  }
}

