package irvine.oeis;

import java.util.Arrays;

import irvine.math.z.Z;

/**
 * An integer linear recurrence.
 * @author Sean A. Irvine
 */
public class LinearRecurrence implements Sequence {

  private Z[] mPrev;
  private long[] mRecur;
  private int mN;

  private static void checkLength(final int a, final int b) {
    if (a != b) {
      throw new IllegalArgumentException(a + " != " + b);
    }
  }

  /**
   * Construct the specified recurrence.
   * @param recurrence multipliers on the coefficients with the oldest term first
   * @param preTerms terms occurring before the first term to generate
   */
  public LinearRecurrence(final long[] recurrence, final long[] preTerms) {
    checkLength(recurrence.length, preTerms.length);
    mPrev = new Z[preTerms.length];
    for (int k = 0; k < preTerms.length; ++k) {
      mPrev[k] = Z.valueOf(preTerms[k]);
    }
    mRecur = Arrays.copyOf(recurrence, recurrence.length);
    mN = 0;
  }

  /**
   * Construct the specified recurrence.
   * @param recurrence multipliers on the coefficients with the oldest term first
   * @param preTerms terms occurring before the first term to generate
   */
  protected LinearRecurrence(final long[] recurrence, final Z[] preTerms) {
    checkLength(recurrence.length, preTerms.length);
    mPrev = Arrays.copyOf(preTerms, preTerms.length);
    mRecur = Arrays.copyOf(recurrence, recurrence.length);
    mN = 0;
  }

  @Override
  public Z next() {
    if (mN < mRecur.length) {
      return mPrev[mN++];
    }
    Z t = Z.ZERO;
    for (int k = 0; k < mRecur.length; ++k) {
      t = t.add(mPrev[k].multiply(mRecur[k]));
      mPrev[k] = k == mRecur.length - 1 ? t : mPrev[k + 1];
    }
    return t;
  }
}
