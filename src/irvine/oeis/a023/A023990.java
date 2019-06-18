package irvine.oeis.a023;

import irvine.math.z.Z;

/**
 * A023990 Sum of exponents of primes in multinomial coefficient <code>M(4n; 2n,n,n)/M(3n; n,n,n)</code>.
 * @author Sean A. Irvine
 */
public class A023990 extends A023978 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(multinomialOmega(4 * mN, 2 * mN, mN, mN) - multinomialOmega(3 * mN, mN, mN, mN));
  }
}

