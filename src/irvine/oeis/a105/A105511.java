package irvine.oeis.a105;

import irvine.math.z.Z;
import irvine.oeis.a008.A008963;

/**
 * A105511 Number of times 1 is the leading digit of the first n+1 Fibonacci numbers in decimal representation.
 * @author Georg Fischer
 */
public class A105511 extends A008963 {

  private Z mDigit;
  private Z mCount;

  /** Construct the sequence. */
  public A105511() {
    this(1);
  }

  /**
   * Generic constructor with parameters
   * @param digit
   */
  public A105511(final int digit) {
    mDigit = Z.valueOf(digit);
    mCount = Z.ZERO;
  }

  @Override
  public Z next() {
    if (super.next().equals(mDigit)) {
      mCount = mCount.add(1);
    }
    return mCount;
  }
}
