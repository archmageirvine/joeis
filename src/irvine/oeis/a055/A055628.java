package irvine.oeis.a055;

import irvine.factor.prime.Fast;
import irvine.math.group.IntegersModMul;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A055628 Primes p whose period of the reciprocal 1/p is (p-1)/3.
 * Partly copied form A002371
 * @author Georg Fischer
 */
public class A055628 extends Sequence1 {

  protected Z mDiv; // divisor
  private final Fast mFastPrime = new Fast();
  protected Z mPrime;

  /** Construct the sequence. */
  public A055628() {
    this(3);
  }

  /**
   * Generic constructor with parameters
   * @param den divisor
   */
  public A055628(final int div) {
    mDiv = Z.valueOf(div);
    mPrime = Z.ONE;
    for (int n = 1; n <= 3; ++n) { // skip over 2, 3, 5
      mPrime = mFastPrime.nextPrime(mPrime);
    }
  }

  @Override
  public Z next() {
    while (true) {
      mPrime = mFastPrime.nextPrime(mPrime);
      final IntegersModMul r = new IntegersModMul(mPrime);
      final Z pl = r.order(Z.TEN);
      // System.out.println("mPrime=" + mPrime + ", pl=" + pl);
      final Z[] quot = mPrime.subtract(1).divideAndRemainder(mDiv);
      if (quot[1].isZero() && quot[0].equals(pl)) {
        return mPrime;
      }
    }
  }
}
