package irvine.oeis.a059;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A059900 Successively interleaved alternate bits in binary expansion of n gives vector of exponents in prime factorization of a(n).
 * @author Sean A. Irvine
 */
public class A059900 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mN = -1;

  private Z decode(final Z n) {
    Z decoding = Z.ONE;
    int k = 0;
    final int len = n.bitLength();
    int s;
    for (Z p = Z.TWO; (s = (1 << k) - 1) <= len; p = mPrime.nextPrime(p)) {
      ++k;
      long v = 0;
      long b = 1;
      while (s <= len) {
        if (n.testBit(s)) {
          v |= b;
        }
        b <<= 1;
        s += 2 * k;
      }
      decoding = decoding.multiply(p.pow(v));
    }
    return decoding;
  }

  @Override
  public Z next() {
    return decode(Z.valueOf(++mN));
  }
}
