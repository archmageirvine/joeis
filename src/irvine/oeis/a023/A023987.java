package irvine.oeis.a023;

import irvine.math.z.Z;

/**
 * A023987 Sum of exponents of primes in C(5n,3n)/C(3n,2n).
 * @author Sean A. Irvine
 */
public class A023987 extends A023847 {

  /** Construct the sequence. */
  public A023987() {
    super(1);
  }

  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(binomialOmega(5 * ++mN, 3 * mN) - binomialOmega(3 * mN, 2 * mN));
  }
}

