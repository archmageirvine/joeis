package irvine.oeis.a072;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A072676 Numbers k for which the prime circle problem has a solution composed of disjoint subsets: the arrangement of numbers 1 through 2k around a circle is such that the sum of each pair of adjacent numbers is prime, the odd numbers are in order and the even numbers are in groups of decreasing sequences.
 * @author Sean A. Irvine
 */
public class A072676 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (mPrime.isPrime(4 * mN - 1) && mPrime.isPrime(2 * mN + 1)) {
        return Z.valueOf(mN);
      }
      for (long i = 1; i < mN; ++i) {
        if (mPrime.isPrime(2 * mN + 2 * i - 1) && mPrime.isPrime(2 * mN + 2 * i + 1) && mPrime.isPrime(2 * i + 1)) {
          return Z.valueOf(mN);
        }
      }
    }
  }
}
