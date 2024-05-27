package irvine.oeis.a069;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A069832 Prefixing, suffixing or inserting a 7 in the number anywhere gives a prime.
 * @author Sean A. Irvine
 */
public class A069832 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private final long mDigit;
  private long mN = -1;

  protected A069832(final long digit) {
    mDigit = digit;
  }

  /** Construct the sequence. */
  public A069832() {
    this(7);
  }

  private boolean is(final long n) {
    assert (n & 1) == 0; // assume odd
    if (!mPrime.isPrime(n * 10 + mDigit)) {
      // Handle cases where appending 7 leads to a prime
      return false;
    }
    if (mN % 10 == 5) {
      // All multiples of 5 are excluded
      return false;
    }
    // The existing last digit could conceivably lead to a prime
    final String s = String.valueOf(n);
    for (int k = 0; k < s.length(); ++k) {
      if (!mPrime.isPrime(Long.parseLong(s.substring(0, k) + mDigit + s.substring(k)))) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      mN += 2;
      if (is(mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}

