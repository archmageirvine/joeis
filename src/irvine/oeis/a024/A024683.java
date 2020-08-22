package irvine.oeis.a024;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A024683 a(n) = number of ways p(n) is a sum of two composite numbers r,s satisfying r &lt; s.
 * @author Sean A. Irvine
 */
public class A024683 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mP = 1;

  @Override
  public Z next() {
    mP = mPrime.nextPrime(mP);
    long c = 0;
    for (long r = 2; 2 * r < mP; ++r) {
      if (!mPrime.isPrime(r) && !mPrime.isPrime(mP - r)) {
        ++c;
      }
    }
    return Z.valueOf(c);
  }
}
