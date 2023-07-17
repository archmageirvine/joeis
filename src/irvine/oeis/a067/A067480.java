package irvine.oeis.a067;

import irvine.math.z.Z;
import irvine.oeis.a008.A008952;

/**
 * A067480 Powers of 2 with initial digit 2.
 * @author Georg Fischer
 */
public class A067480 extends A008952 {

  protected int mN;
  protected Z mDigit;

  /** Construct the sequence. */
  public A067480() {
    this(1, 2);
  }

  /**
   * Generic constructor with parameters
   * @param digit leading digit
   */
  public A067480(final int digit) {
    this(0, digit);
  }

  /**
   * Generic constructor with parameters
   * @param offset first index
   * @param digit leading digit
   */
  public A067480(final int offset, final int digit) {
    super(offset);
    mN = -1;
    mDigit = Z.valueOf(digit);
  }

  @Override
  public Z next() {
    ++mN;
    while (!super.next().equals(mDigit)) {
      ++mN;
    }
    return Z.ONE.shiftLeft(mN);
  }
}
