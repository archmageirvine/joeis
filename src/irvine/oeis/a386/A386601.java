package irvine.oeis.a386;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A386601 Primes that change into other primes of the same length at each of the four possible stages when all of their digits simultaneously shift along the ...8-9-0-1-2-3-4-5-6-7-8-9-0-1-2-3... cycle. No leading zeros and so no differing lengths of the changing primes are allowed.
 * @author Sean A. Irvine
 */
public class A386601 extends A000040 {

  private boolean is(final Z p) {
    final String s = p.toString();
    int cnt = 0;
    for (int shift = 1; shift < 10; ++ shift) {
      long v = 0;
      for (int k = 0; k < s.length(); ++k) {
        v *= 10;
        v += (s.charAt(k) - '0' + shift) % 10;
        if (v == 0) {
          break; // leading 0 detected
        }
      }
      if (mPrime.isPrime(v)) {
        ++cnt;
      }
    }
    return cnt == 3;
  }

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (is(p)) {
        return p;
      }
    }
  }
}

