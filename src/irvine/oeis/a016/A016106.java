package irvine.oeis.a016;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.string.StringUtils;

/**
 * A016106 Nonpalindromic and "non-core" numbers that when squared give palindrome with odd number of digits.
 * @author Georg Fischer
 */
public class A016106 implements Sequence {

  protected int mVariant;
  private Z mN = Z.TEN;

  /** Construct the sequence. */
  public A016106() {
    this(1);
  }

  /**
   * Generic constructor with parameter.
   * @param variant 1 = yield number, 2 = yield square
   */
  public A016106(final int variant) {
    mVariant = variant;
  }

  /**
   * Test the "non-core, non-palindromic" condition
   * @param n number to be tested
   * @return true iff the condition is fulfilled
   */
  protected boolean nonCore(final Z n) {
    final String nstr = n.toString();
    return nstr.charAt(0) != nstr.charAt(nstr.length() - 1)
      || (nstr.length() >= 4 && nstr.charAt(1) != nstr.charAt(nstr.length() - 2));
  }

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final Z n2 = mN.square();
      final String nstr2 = n2.toString();
      if (nonCore(mN) && (nstr2.length() & 1) == 1 && StringUtils.isPalindrome(nstr2)) {
        return mVariant == 1 ? mN : n2;
      }
    }
  }
}
