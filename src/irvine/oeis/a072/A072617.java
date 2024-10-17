package irvine.oeis.a072;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A072617 Number of essentially different ways of arranging numbers 1 through 2n around a circle so that the sum of each pair of adjacent numbers is prime, with the odd and even numbers in order in opposite directions.
 * @author Sean A. Irvine
 */
public class A072617 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  private boolean is(final int shift) {
    final long n2 = mN * 2;
    for (long k = mN, j = shift; k > 0; --k, ++j) {
      if (j > mN) {
        j -= mN;
      }
      if (!mPrime.isPrime(2 * k - 1 + 2 * j)) {
        return false;
      }
      if (!mPrime.isPrime((2 * k + 1) % n2 + 2 * j)) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    if (++mN <= 5) {
      return Z.ONE; // Really only to handle the case n==2
    }
    int count = 0;
    for (int shift = 1; shift <= mN; ++shift) {
      if (is(shift)) {
        ++count;
      }
    }
    return Z.valueOf(count);
  }
}
