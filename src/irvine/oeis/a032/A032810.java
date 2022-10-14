package irvine.oeis.a032;

import irvine.math.z.Z;
import irvine.oeis.SequenceWithOffset;

/**
 * A032810 Numbers using only digits 2 and 3.
 * @author Georg Fischer
 */
public class A032810 implements SequenceWithOffset {

  private int mN;
  private final int mOffset;
  private final char mDigit1;
  private final char mDigit2;

  /** Construct the sequence. */
  public A032810() {
    this(1, 2, 3);
  }

  /**
   * Generic constructor with parameters
   * @param offset first index
   * @param digit1 lower digit
   * @param digit2 higher digit
   */
  public A032810(final int offset, final int digit1, final int digit2) {
    mN = 1;
    mOffset = offset;
    mDigit1 = Character.forDigit(digit1, 10);
    mDigit2 = Character.forDigit(digit2, 10);
  }

  @Override
  public int getOffset() {
    return mOffset;
  }

  @Override
  public Z next() {
    return new Z(Long.toBinaryString(++mN).substring(1).replace('1', mDigit2).replace('0', mDigit1));
  }
}
