package irvine.oeis.a075;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A075157 Run lengths in the binary expansion of n gives the vector of exponents in prime factorization of a(n)+1, with the least significant run corresponding to the exponent of the least prime, 2; with one subtracted from each run length, except for the most significant run of 1's.
 * @author Sean A. Irvine
 */
public class A075157 extends Sequence0 {

  private final Fast mPrime = new Fast();
  private long mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ZERO;
    }
    long m = mN;
    Z prod = Z.ONE;
    Z p = Z.ONE;
    while (m != 0) {
      final long bit = m & 1;
      int cnt = 0;
      m >>>= 1;
      while ((m & 1) == bit) {
        ++cnt;
        m >>>= 1;
      }
      p = mPrime.nextPrime(p);
      prod = prod.multiply(p.pow(m == 0 ? cnt + 1 : cnt));
    }
    return prod.subtract(1);
  }
}
