package irvine.oeis.a061;

import java.util.Arrays;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.AbstractSequence;

/**
 * A061814 Multiples of 4 containing only even digits.
 * @author Georg Fischer
 */
public class A061814 extends AbstractSequence {

  private long mN;
  private final long mMult;
  private final boolean[] mWrongDigits;

  /** Construct the sequence. */
  public A061814() {
    this(0, 4, 0, 2, 4, 6, 8);
  }

  /**
   * Generic constructor with parameters
   * @param offset index of first term
   * @param mult checks multiples of this number
   * @param digits digits that may be present
   */
  public A061814(final int offset, final int mult, final int... digits) {
    super(offset);
    mN = offset - 1;
    mMult = mult;
    mWrongDigits = new boolean[10];
    Arrays.fill(mWrongDigits, true);
    for (final int digit : digits) {
      mWrongDigits[digit] = false;
    }
  }

  /**
   * Test the condition.
   * @param n number to be tested
   * @return true (false) if the condition is (not) met.
   */
  private boolean isOk(final long n) {
    final int[] counts = ZUtils.digitCounts(mMult * n);
    boolean result = true; // assume success
    int i = 0;
    while (result && i < 10) {
      if (mWrongDigits[i] && counts[i] > 0) {
        result = false; // failure
      }
      ++i;
    }
    return result;
  }

  @Override
  public Z next() {
    while (!isOk(++mN)) {
    }
    return Z.valueOf(mN).multiply(mMult);
  }
}
