package irvine.oeis.a072;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A072185 Primes p = x1x2x3...xn in base 10 such that x1^p1 + x2^p2 + x3^p3 + ... + xn^pn is a prime, where pn is the n-th prime.
 * @author Sean A. Irvine
 */
public class A072185 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      final String s = p.toString();
      long q = 2;
      Z sum = Z.ZERO;
      for (int k = 0; k < s.length(); ++k, q = mPrime.nextPrime(q)) {
        sum = sum.add(Z.valueOf(s.charAt(k) - '0').pow(q));
      }
      if (mPrime.isPrime(sum)) {
        return p;
      }
    }
  }
}
