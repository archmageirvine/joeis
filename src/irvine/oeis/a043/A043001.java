package irvine.oeis.a043;
// manually 2021-02-28

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A043001 n-th base 3 palindrome that starts with 1.
 * @author Georg Fischer
 */
public class A043001 implements Sequence {

  protected int mRadix; // number system base
  protected int mStart; // first digit (in mRadix)
  protected Z mInner; // inner left part, behind mStart
  protected int mWidth; // current width of part to be mirrored
  protected Z mRadixPower; // powers of mRadix

  /** Construct the sequence. */
  public A043001() {
    this(3, 1);
  }

  /**
   * Generic constructor for similar sequences.
   * @param radix  number system base
   * @param start first digit
   */
  public A043001(final int radix, final int start) {
    mRadix = radix;
    mStart = start;
    mWidth = 1;
    mRadixPower = Z.ONE;
    mInner = Z.ZERO;
  }

  /**
   * Makes a palindrome out of a number String
   * @param left String to be mirrored
   * @param width desired resulting length
   * @return for example 12321 for ('123', 5), but 123321 for ('123', 6)
   */
  protected Z mirror(final String left, final int width) {
    final StringBuilder result = new StringBuilder(32);
    result.append(left);
    final int last = left.length() - 1;
    for (int pos = (width & 1) == 0 ? 0 : 1; pos <= last; ++pos) {
      result.append(left.charAt(last - pos));
    }
    return new Z(result.toString(), mRadix);
  }
  
  @Override
  public Z next() {
    if (mWidth == 1) {
      ++mWidth;
      return new Z(String.valueOf(mStart), mRadix);
    } else if (mWidth == 2) {
      ++mWidth;
      mInner = Z.ZERO;
      mRadixPower = mRadixPower.multiply(mRadix);
      return new Z(String.valueOf(mStart) + String.valueOf(mStart), mRadix);
    } else {
      final Z left = mRadixPower.multiply(mStart).add(mInner);
      final Z result = mirror(left.toString(mRadix), mWidth);
      // System.out.println("mWidth=" + mWidth + ", mInner=" + mInner + ", mRadixPower=" + mRadixPower + ", result=" + result.toString(mRadix));
      mInner = mInner.add(1);
      if (mInner.compareTo(mRadixPower) >= 0) {
        if ((mWidth & 1) == 0) {
          mRadixPower = mRadixPower.multiply(mRadix);
        }
        ++mWidth;
        mInner = Z.ZERO;
      }
      return result;
    }
  } // next
}
