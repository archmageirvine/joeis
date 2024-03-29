package irvine.oeis.a074;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A074993 a(n) = floor((concatenation of n, n+1)/2).
 * @author Georg Fischer
 */
public class A074993 extends AbstractSequence {

  private int mN;
  private final boolean mIncreasing; // true for increasing, false for decreasing numbers
  private final int mDiv;
  private final StringBuilder mSb = new StringBuilder();

  /** Construct the sequence. */
  public A074993() {
    this(0, 2);
  }

  /**
   * Generic constructor with parameters
   * @param offset first index
   * @param div divisor, positive for increasing, negative for decreasing numbers
   */
  public A074993(final int offset, final int div) {
    super(offset);
    mN = -1;
    if (div >= 0) {
      mDiv = div;
      mIncreasing = true;
    } else {
      mDiv = -div;
      mIncreasing = false;
    }
  }

  @Override
  public Z next() {
    ++mN;
    mSb.setLength(0);
    if (mIncreasing) {
      for (int k = 0; k < mDiv; ++k) {
        mSb.append(mN + k);
      }
    } else {
      for (int k = mDiv - 1; k >= 0; --k) {
        mSb.append(mN + k);
      }
    }
    return new Z(mSb.toString()).divide(mDiv);
  }
}
