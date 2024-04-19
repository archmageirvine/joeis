package irvine.oeis.a061;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A061810 Multiples of 3 with all odd digits.
 * @author Georg Fischer
 */
public class A061810 extends AbstractSequence {

  private long mN;
  private final Z mDigit;
  private final String mPattern;

  /** Construct the sequence. */
  public A061810() {
    this(1, 3, "[13579]+");
  }

  /**
   * Generic constructor with parameters
   * @param offset first index
   * @param digit test some multiple of this digit
   * @param pattern terms must match this pattern
   */
  public A061810(final int offset, final int digit, final String pattern) {
    super(offset);
    mN = -1;
    mDigit = Z.valueOf(digit);
    mPattern = pattern;
  }

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final Z result = mDigit.multiply(mN);
      if (result.toString().matches(mPattern)) {
        return result;
      }
    }
  }
}
