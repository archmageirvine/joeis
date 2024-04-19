package irvine.oeis.a269;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.AbstractSequence;

/**
 * A269241 Number of times the digit 1 appears in the decimal expansion of n^3.
 * @author Georg Fischer
 */
public class A269241 extends AbstractSequence {

  private long mN;
  private final int mDigit;
  private final int mExpon;

  /** Construct the sequence. */
  public A269241() {
    this(0, 3, 1);
  }

  /**
   * Generic constructor with parameters
   * @param offset first index
   * @param expon power of n
   * @param digit count this digit
   */
  public A269241(final int offset, final int expon, final int digit) {
    super(offset);
    mN = -1;
    mExpon = expon;
    mDigit = digit;
  }

  @Override
  public Z next() {
    return Z.valueOf(ZUtils.digitCounts(Z.valueOf(++mN).pow(mExpon))[mDigit]);
  }
}
