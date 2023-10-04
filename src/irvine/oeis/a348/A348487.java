package irvine.oeis.a348;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A348487 Positive numbers whose square starts and ends with exactly one 1.
 * @author Georg Fischer
 */
public class A348487 extends AbstractSequence {

  private int mN;
  private char mDigit;

  /** Construct the sequence. */
  public A348487() {
    this(1, 1);
  }

  /**
   * Generic constructor with parameters
   * @param offset first index
   * @param digit first and last digit
   */
  public A348487(final int offset, final int digit) {
    super(offset);
    mN = offset - 1;
    mDigit = String.valueOf(digit).charAt(0);
  }

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final String s = Z.valueOf(mN).square().toString();
      final int len = s.length();
      if (s.charAt(0) == mDigit
        && s.charAt(len - 1) == mDigit
        && (len <= 2 || (s.charAt(1) != mDigit && s.charAt(len - 2) != mDigit))
      ) {
        return Z.valueOf(mN);
      }
    }
  }
}
