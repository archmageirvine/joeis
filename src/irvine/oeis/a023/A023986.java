package irvine.oeis.a023;

import irvine.math.z.Z;

/**
 * A023986 Sum of exponents of primes in <code>C(4n,2n)/C(2n,n)</code>.
 * @author Sean A. Irvine
 */
public class A023986 extends A023847 {

  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(binomialOmega(4 * ++mN, 2 * mN) - binomialOmega(2 * mN, mN));
  }
}

