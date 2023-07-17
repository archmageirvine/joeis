package irvine.oeis.a023;

import irvine.math.z.Z;

/**
 * A023986 Sum of exponents of primes in C(4n,2n)/C(2n,n).
 * @author Sean A. Irvine
 */
public class A023986 extends A023847 {

  private long mN = 0;

  /** Construct the sequence. */
  protected A023986() {
    super(1);
  }

  @Override
  public Z next() {
    return Z.valueOf(binomialOmega(4 * ++mN, 2 * mN) - binomialOmega(2 * mN, mN));
  }
}

