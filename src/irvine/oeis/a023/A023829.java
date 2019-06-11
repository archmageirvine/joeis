package irvine.oeis.a023;

import irvine.math.z.Z;

/**
 * A023829 Sum of exponents in prime-power factorization of <code>C(4n,n-3)</code>.
 * @author Sean A. Irvine
 */
public class A023829 extends A023847 {

  private long mN = 2;

  @Override
  public Z next() {
    return Z.valueOf(binomialOmega(4 * ++mN, mN - 3));
  }
}

