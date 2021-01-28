package irvine.oeis;

import java.util.Arrays;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;

/**
 * An integer linear recurrence.
 * @author Sean A. Irvine
 */
public class LinearRecurrence implements Sequence {

  private static final Z[] EMPTY = new Z[0];

  private Z[] mPreTerms;
  private Z[] mPrev;
  private Z[] mRecur;
  private int mN;

  private static void checkLength(final int a, final int b) {
    if (a != b) {
      throw new IllegalArgumentException(a + " != " + b);
    }
  }

  /**
   * Construct the specified recurrence.
   * @param recurrence multipliers on the coefficients with the oldest term first
   * @param terms initial terms of the recurrence
   * @param preTerms terms to produce before the recurrence
   */
  protected LinearRecurrence(final Z[] recurrence, final Z[] terms, final Z... preTerms) {
    checkLength(recurrence.length, terms.length);
    mPreTerms = Arrays.copyOf(preTerms, preTerms.length);
    mPrev = Arrays.copyOf(terms, terms.length);
    mRecur = Arrays.copyOf(recurrence, recurrence.length);
    mN = 0;
  }

  /**
   * Construct the specified recurrence.
   * @param recurrence multipliers on the coefficients with the oldest term first
   * @param terms initial terms of the recurrence
   * @param preTerms terms to produce before the recurrence
   */
  protected LinearRecurrence(final long[] recurrence, final Z[] terms, final Z... preTerms) {
    this(ZUtils.toZ(recurrence), terms, preTerms);
  }

  /**
   * Construct the specified recurrence.
   * @param recurrence multipliers on the coefficients with the oldest term first
   * @param terms initial terms of the recurrence
   * @param preTerms terms to produce before the recurrence
   */
  public LinearRecurrence(final long[] recurrence, final long[] terms, final long... preTerms) {
    this(recurrence, ZUtils.toZ(terms), ZUtils.toZ(preTerms));
  }

  /**
   * Construct the specified recurrence.
   * @param recurrence multipliers on the coefficients with the oldest term first
   * @param terms initial terms of the recurrence
   */
  public LinearRecurrence(final long[] recurrence, final long[] terms) {
    this(recurrence, ZUtils.toZ(terms), EMPTY);
  }

  /**
   * Construct the specified recurrence.
   * @param recurrence multipliers on the coefficients with the oldest term first
   * @param terms initial terms of the recurrence
   */
  protected LinearRecurrence(final long[] recurrence, final Z[] terms) {
    this(recurrence, terms, EMPTY);
  }

  /**
   * Construct the specified recurrence.
   * @param recurrence multipliers on the coefficients with the oldest term first
   * @param terms initial terms of the recurrence
   */
  protected LinearRecurrence(final String recurrence, final String terms) {
    this(LongUtils.toLong(recurrence), ZUtils.toZ(terms), EMPTY);
  }

  @Override
  public Z next() {
    if (mN < mPreTerms.length) {
      return mPreTerms[mN++];
    }
    final int m = mN - mPreTerms.length;
    if (m < mRecur.length) {
      ++mN;
      return mPrev[m];
    }
    Z t = Z.ZERO;
    for (int k = 0; k < mRecur.length; ++k) {
      t = t.add(mPrev[k].multiply(mRecur[k]));
      mPrev[k] = k == mRecur.length - 1 ? t : mPrev[k + 1];
    }
    return t;
  }

  /**
   * Gets the vector for the terms that participate in the recurrence.
   * @return a vector for the initial values of the sequence.
   */
  public Z[] getTerms() {
    return mPrev;
  }

  /**
   * Gets the vector for the initial terms.
   * @return the prefixed terms followed by the terms that participate in the recurrence.
   */
  public Z[] getInitTerms() {
    final Z[] result = new Z[mPreTerms.length + mPrev.length];
    System.arraycopy(mPreTerms, 0, result, 0, mPreTerms.length);
    System.arraycopy(mPrev, 0, result, mPreTerms.length, mPrev.length);
    return result;
  }

  /**
   * Gets the vector for the recurrence (reversed signature).
   * @return a vector with the constant coefficients.
   */
  public Z[] getRecurrence() {
    return mRecur;
  }

  /**
   * Gets the vector for the signature (reversed recurrence).
   * @return a vector with the constant coefficients.
   */
  public Z[] getSignature() {
    final int rlen = mRecur.length;
    final Z[] result = new Z[rlen];
    for (int irec = 0; irec < rlen; irec++) {
      result[irec] = mRecur[rlen - 1 - irec];
    }
    return result;
  }

}
