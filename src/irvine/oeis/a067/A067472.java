package irvine.oeis.a067;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A067472 Smallest n-digit square starting with 2.
 * @author Georg Fischer
 */
public class A067472 extends AbstractSequence {

  private final int mDigit;
  private Z mPow10;

  /** Construct the sequence. */
  public A067472() {
    this(2, 2);
  }

  /**
   * Generic constructor with parameters
   * @param offset
   * @param digit
   */
  public A067472(final int offset, final int digit) {
    super(offset);
    mDigit = digit;
    mPow10 = Z.TEN.pow(offset - 1);
  }

  @Override
  public Z next() {
    final Z dten = mPow10.multiply(mDigit);
    Z sr = dten.sqrt(); // digit * 10^n
    Z sr2 = sr.multiply(sr);
    if (sr2.compareTo(dten) < 0) {
      sr = sr.add(1);
      sr2 = sr.multiply(sr);
    }
    mPow10 = mPow10.multiply(10);
    return sr2.compareTo(mPow10) < 0 ? sr2 : Z.ZERO;
  }
}
