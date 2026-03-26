package irvine.oeis.a084;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A084299 Smallest primes such that the subsequent terms of consecutive prime differences (A001223) modulo 6 (A054763) displays repeatedly n times a {0,2,4} pattern of remainders of differences.
 * @author Sean A. Irvine
 */
public class A084299 extends A000040 {

  private int mN = 0;
  private Z mP = super.next();

  private boolean is(final Z p, final int n) {
    long q = p.longValueExact();
    for (int k = 0; k < n; ++k) {
      long r = q;
      q = mPrime.nextPrime(q);
      if ((q - r) % 6 != 0) {
        return false;
      }
      r = q;
      q = mPrime.nextPrime(q);
      if ((q - r) % 6 != 2) {
        return false;
      }
      r = q;
      q = mPrime.nextPrime(q);
      if ((q - r) % 6 != 4) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    ++mN;
    while (!is(mP, mN)) {
      mP = mPrime.nextPrime(mP);
    }
    return mP;
  }
}
