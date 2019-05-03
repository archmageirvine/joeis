package irvine.oeis.a020;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A020483 Least prime p such that <code>p+2n</code> is also prime.
 * @author Sean A. Irvine
 */
public class A020483 implements Sequence {

  private final Fast mPrime = new Fast();
  protected long mN = -2;

  @Override
  public Z next() {
    mN += 2;
    long p = 2;
    while (true) {
      if (mPrime.isPrime(p + mN)) {
        return Z.valueOf(p);
      }
      p = mPrime.nextPrime(p);
    }
  }
}
