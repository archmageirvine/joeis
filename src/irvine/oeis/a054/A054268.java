package irvine.oeis.a054;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A054268 Sum of composite numbers between prime p and nextprime(p) is a repdigit.
 * @author Sean A. Irvine
 */
public class A054268 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mN = 3;

  private boolean isRepDigit(long sum) {
    long r = sum % 10;
    sum /= 10;
    while (sum != 0) {
      if (sum % 10 != r) {
        return false;
      }
      sum /= 10;
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      final long p = mN;
      long sum = 0;
      while (!mPrime.isPrime(++mN)) {
        sum += mN;
      }
      if (isRepDigit(sum)) {
        return Z.valueOf(p);
      }
    }
  }
}
