package irvine.oeis.a068;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A068958 Smallest value of k such that p | (10^k + 1), where p is the n-th prime; or 0 if no such k exists.
 * @author Sean A. Irvine
 */
public class A068958 extends AbstractSequence {

  private final Fast mPrime = new Fast();
  private long mP = 5;

  /** Construct the sequence. */
  public A068958() {
    super(4);
  }

  @Override
  public Z next() {
    mP = mPrime.nextPrime(mP);
    long m = 1;
    for (long k = 1; true; ++k) {
      m *= 10;
      m %= mP;
      if (m == mP - 1) {
        return Z.valueOf(k);
      }
      if (m == 1) {
        return Z.ZERO;
      }
    }
  }
}
