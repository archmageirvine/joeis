package irvine.oeis.a113;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A113830 Leading term of a 2 X n generalized arithmetic progression (GAP) of primes with smallest last term.
 * @author Sean A. Irvine
 */
public class A113830 extends Sequence2 {

  // todo does not reproduce terms of sequence

  private final Fast mPrime = new Fast();
  private long mN = 1;

  private boolean is(final long a, final long b, final long c) {
    for (int j = 1; j < mN; ++j) {
      if (!mPrime.isPrime(a + c * j) || !mPrime.isPrime(a + b + c * j)) {
        return false;
      }
    }
//    if (mPrime.isPrime(a + mN * c) && mPrime.isPrime(a + b + mN * c)) {
//      return false;
//    }
    return true;
  }

  @Override
  public Z next() {
    ++mN;
    long a = mN; // dubious
    long min = Long.MAX_VALUE;
    long minA = 0;
    while (true) {
      a = mPrime.nextPrime(a);
      if (a + mN > min) {
        break;
      }
      for (long b = 1; 2 * a + b < min; ++b) {
        if (mPrime.isPrime(a + b)) {
          for (long c = 1; a + b + c * (mN - 1) < min; ++c) {
            if (c == b) {
              continue;
            }
            //System.out.println("k=" + mN + " trying " + a + " " + b + " " + c);
            if (is(a, b, c)) {
              min = a + b + c * (mN - 1);
              minA = a;
              System.out.println("k=" + mN + " min reduced to " + min + " with a=" + a + " b=" + b + " c=" + c);
            }
          }
        }
      }
    }

    return Z.valueOf(minA);
  }
}
