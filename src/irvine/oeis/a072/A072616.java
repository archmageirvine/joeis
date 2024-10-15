package irvine.oeis.a072;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A072616 Number of essentially different ways of arranging numbers 1 through 2n around a circle so that the sum of each pair of adjacent numbers is prime and the odd (or even) numbers are in order.
 * @author Sean A. Irvine
 */
public class A072616 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;
  private long mCount = 0;

  private void search(final int pos, final long used) {
    if (pos > mN) {
      ++mCount;
      return;
    }
    if (pos != mN) {
      final int i = 2 * pos;
      for (int k = 1; k <= mN; ++k) {
        if ((used & (1L << k)) == 0) {
          final int j = 2 * k;
          if (mPrime.isPrime(j + i - 1) && mPrime.isPrime(j + i + 1)) {
            search(pos + 1, used | (1L << k));
          }
        }
      }
    } else {
      // Avoid need to use mod operation on i
      for (int k = 1; k <= mN; ++k) {
        if ((used & (1L << k)) == 0) {
          final int j = 2 * k;
          if (mPrime.isPrime(j + 2L * pos - 1) && mPrime.isPrime(j + 1)) {
            search(pos + 1, used | (1L << k));
          }
        }
      }
    }
  }

  @Override
  public Z next() {
    if (++mN <= 4) {
      return Z.ONE; // Really only to handle the case n==2
    }
    mCount = 0;
    search(1, 0);
    return Z.valueOf(mCount);
  }
}
