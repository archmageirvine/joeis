package irvine.oeis.a023;

import irvine.math.z.Z;

/**
 * A023834 Sum of exponents in prime-power factorization of C(4n,2n).
 * @author Sean A. Irvine
 */
public class A023834 extends A023847 {

  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(binomialOmega(4 * ++mN, 2 * mN));
  }
}

