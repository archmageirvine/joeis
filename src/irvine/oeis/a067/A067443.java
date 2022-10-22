package irvine.oeis.a067;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A067443 Smallest n-th power starting with 2.
 * @author Georg Fischer
 */
public class A067443 extends AbstractSequence {

  private int mN;
  private final char mDigit;

  /** Construct the sequence. */
  public A067443() {
    this(1, 2);
  }

  /**
   * Generic constructor with parameters
   * @param offset first index
   * @param digit starting digit
   */
  public A067443(final int offset, final int digit) {
    super(offset);
    mN = 0;
    mDigit = Character.forDigit(digit, 10);
  }

  @Override
  public Z next() {
    ++mN;
    if (mN == 1 && mDigit == '1') {
      return Z.ONE;
    }
    Z k = Z.TWO;
    Z powk = k.pow(mN);
    while (powk.toString().charAt(0) != mDigit) {
      k = k.add(1);
      powk = k.pow(mN);
    }
    return powk;
  }
}
