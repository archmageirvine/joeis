package irvine.oeis.a023;

import irvine.math.z.Z;

/**
 * A023821 Sum of exponents in prime-power factorization of <code>C(3n,n-2)</code>.
 * @author Sean A. Irvine
 */
public class A023821 extends A023847 {

  private long mN = 1;

  @Override
  public Z next() {
    return Z.valueOf(binomialOmega(3 * ++mN, mN - 2));
  }
}

