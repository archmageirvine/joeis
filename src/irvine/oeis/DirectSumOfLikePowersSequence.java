package irvine.oeis;

import java.util.Arrays;

import irvine.math.z.Z;

/**
 * Generate terms for a sequence of like powers.
 * @author Sean A. Irvine
 */
public class DirectSumOfLikePowersSequence implements Sequence {

  // A version of LimitedSumOfLikePowerSequence that tries numbers one at a time.
  // This can be faster for situations where most numbers have the required
  // number of representations.

  private static class Representations {

    private int mPower;
    private Z[] mPowers;
    private long mCount = 0;
    private long mWaysExit;

    private Representations(final int power, final long ways) {
      mPower = power;
      mWaysExit = ways + 1;
      mPowers = new Z[10];
      for (int k = 0; k < mPowers.length; ++k) {
        mPowers[k] = Z.valueOf(k).pow(power);
      }
    }

    private Z power(final int p) {
      while (p >= mPowers.length) {
        int l = mPowers.length;
        mPowers = Arrays.copyOf(mPowers, l * 2);
        while (l < mPowers.length) {
          mPowers[l] = Z.valueOf(l).pow(mPower);
          ++l;
        }
      }
      return mPowers[p];
    }

    private void search(final long[] t, final Z target, final int m, final int prev) {
      if (m == 0) {
        if (target.isZero()) {
          //System.out.println(Arrays.toString(t));
          ++mCount;
        }
        return;
      }
      if (target.signum() <= 0) {
        return;
      }
      final int l = Arrays.binarySearch(mPowers, target.divide(m));
      final int lo = l < 0 ? -2 - l : l;
      final int h = Arrays.binarySearch(mPowers, target);
      final int hi = h < 0 ? -2 - h : h;
      //System.out.println(m + " " + prev + " [" + lo + "," + hi + "]");
      for (int v = Math.min(hi, prev); v >= lo; --v) {
        t[m - 1] = v;
        search(t, target.subtract(mPowers[v]), m - 1, v);
        if (mCount >= mWaysExit) {
          return;
        }
      }
    }
  }

  private final int mPower;
  private final int mNumTerms;
  private final boolean mExactWays;
  private final int mMinWays;
  private long mN = 0;
  private final Representations mRep;

  /**
   * Construct the sequence.
   * @param power the power to be used in each term
   * @param numTerms number of terms in the sum
   * @param minWays minimum numbers of ways to make the sum
   * @param exact number of ways must be exact
   */
  public DirectSumOfLikePowersSequence(final int power, final int numTerms, final int minWays, final boolean exact) {
    mPower = power;
    mNumTerms = numTerms;
    mExactWays = exact;
    mMinWays = minWays;
    mRep = new Representations(mPower, mMinWays);
  }

  /**
   * Construct the sequence. of powers.
   * @param power the power to be used in each term
   * @param terms number of terms in the sum
   * @param minWays minimum number of ways to make the sum
   */
  public DirectSumOfLikePowersSequence(final int power, final int terms, final int minWays) {
    this(power, terms, minWays, false);
  }

  @Override
  public Z next() {
    while (true) {
      final Z n = Z.valueOf(++mN);
      mRep.mCount = 0;
      mRep.power(n.root(mPower).intValueExact()); // Make sure power table is large enough
      mRep.search(new long[mNumTerms], n, mNumTerms, Integer.MAX_VALUE);
      if (mExactWays) {
        if (mRep.mCount == mMinWays) {
          return n;
        }
      } else if (mRep.mCount >= mMinWays) {
        return n;
      }
    }
  }
}
