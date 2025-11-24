package irvine.oeis.a082;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A082077 Balanced primes of order two.
 * @author Sean A. Irvine
 */
public class A082077 extends Sequence1 {

  private final Fast mFast = new Fast();
  private long mP = 1;
  private final int mOrder;
  private final int mTerms;

  /**
   * Construct balanced primes of given order
   * @param order the order
   */
  public A082077(final int order) {
    mOrder = order;
    mTerms = 2 * mOrder + 1;
  }

  /** Construct the sequence. */
  public A082077() {
    this(2);
  }

  @Override
  public Z next() {
    while (true) {
      mP = mFast.nextPrime(mP);
      long s = mP;
      long q = mP;
      long r = mP;
      for (int k = 0; k < mOrder; ++k) {
        q = mFast.prevPrime(q);
        if (q < 2) {
          s = 0;
          break;
        }
        r = mFast.nextPrime(r);
        s += q + r;
      }
      if (s > 0 && s % mTerms == 0 && s / mTerms == mP) {
        return Z.valueOf(mP);
      }
    }
  }
}
