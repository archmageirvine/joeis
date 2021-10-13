package irvine.oeis.a051;

import java.util.Arrays;

/**
 * A051854 Table of solutions to all possible Chinese Remainder Equations x = a1 mod p1, x = a2 mod p2, ..., x = an mod pn, where p1 - pn are the first n primes and each a1 - an varies between 1 and (its respective) p-1, with the rightmost a (an) varying fastest.
 * @author Sean A. Irvine
 */
public class A051854 extends A051853 {

  private long mP = 1;

  protected long[] bump(final long[] a) {
    int k = a.length - 1;
    for (long p = mP; k >= 0 && a[k] < p; --k, p = mPrime.prevPrime(p)) {
      if (++a[k] < p) {
        return a;
      }
      a[k] = 1;
    }
    mP = mPrime.nextPrime(mP);
    final long[] aa = Arrays.copyOf(a, a.length + 1);
    aa[a.length] = 1;
    return aa;
  }
}
