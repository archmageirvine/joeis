package irvine.oeis.a116;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A116068.
 * @author Sean A. Irvine
 */
public class A116068 implements Sequence {

  private long mN = 0;
  private final Fast mPrime = new Fast();
  private Z mPrev = Z.ONE;

  private boolean nondecreasing(long n) {
    long p = 10;
    while (n != 0) {
      final long v = n % 10;
      if (v > p) {
        return false;
      }
      n /= 10;
      p = v;
    }
    return true;
  }

  private boolean nonincreasing(Z n) {
    long p = 0;
    while (!Z.ZERO.equals(n)) {
      final long v = n.mod(10);
      if (v < p) {
        return false;
      }
      n = n.divide(10);
      p = v;
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      ++mN;
      mPrev = mPrime.nextPrime(mPrev);
      if (nondecreasing(mN) && nonincreasing(mPrev)) {
        return Z.valueOf(mN);
      }
    }
  }
}

