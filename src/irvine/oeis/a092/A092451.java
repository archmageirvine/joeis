package irvine.oeis.a092;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A092451 Numbers that either contain the digit 2 or are divisible by 2.
 * @author Georg Fischer
 */
public class A092451 extends AbstractSequence {

  private long mN;
  private char mChar;
  private int mDigit;

  /** Construct the sequence. */
  public A092451() {
    this(0, 2);
  }

  /**
   * Generic constructor with parameters
   * @param offset first index
   * @param digit desired digit
   */
  public A092451(final int offset, final int digit) {
    super(offset);
    mN = offset - 1;
    mDigit = digit;
    mChar = Character.forDigit(digit, 10);
  }

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (String.valueOf(mN).indexOf(mChar) >= 0 || mN % mDigit == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
