package irvine.oeis.a328;

import java.util.Arrays;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.a000.A000032;

/**
 * A328815 allocated for Dmitry Kamenetsky.
 * @author Sean A. Irvine
 */
public class A328815 extends A000032 {

  // Can assume "mA" contains only even numbers and "mN" only odd numbers

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private final Fast mPrime = new Fast();
  private int mN = 0;
  private int mBest = Integer.MAX_VALUE;
  private int[] mA = null;
  private int[] mB = null;

  private boolean isSumsPrime(final int[] t, final int s, final int u) {
    for (int k = 0; k < s; ++k) {
      if (!mPrime.isPrime(t[k] + u)) {
        return false;
      }
    }
    return true;
  }

  private void search(final int an, final int bn, final int k) {
    if (an == mN && bn == mN) {
      // Found a solution
      mBest = k;
      return;
    }
    int j = k;
    while (++j < mBest) {
      if ((j & 1) == 0) {
        // Even numbers go in "mA"
        if (an != mN && isSumsPrime(mB, bn, j)) {
          mA[an] = j;
          search(an + 1, bn, j);
        }
      } else {
        // Odd numbers go in "mB"
        if (bn != mN && isSumsPrime(mA, an, j)) {
          mB[bn] = j;
          search(an, bn + 1, j);
        }
      }
    }
  }

  @Override
  public Z next() {
    mBest = Integer.MAX_VALUE;
    ++mN;
    mA = new int[mN];
    mB = new int[mN];
    search(0, 0, 0);
    if (mVerbose) {
      System.out.println(mN + ": " + Arrays.toString(mA) + " " + Arrays.toString(mB) + " " + mBest);
    }
    return Z.valueOf(mBest);
  }
}
