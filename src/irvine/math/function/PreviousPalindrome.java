package irvine.math.function;

import java.util.Arrays;

import irvine.math.z.Z;

/**
 * Return the previous palindrome not more than the given number.
 * @author Sean A. Irvine
 */
class PreviousPalindrome extends AbstractFunction1 {

  @Override
  public Z z(final Z n) {
    final String s = n.toString();
    final int len = s.length();
    final char[] p = s.toCharArray();

    NextPalindrome.mirror(p);
    final Z candidate = new Z(new String(p));
    if (candidate.compareTo(n) <= 0) {
      return candidate;
    }

    // decrement the middle and propagate borrow
    int i = (len - 1) / 2; // middle for odd, left-middle for even
    while (i >= 0 && p[i] == '0') {
      p[i--] = '9';
    }

    if (i < 0) {
      // underflow like 1000 -> 999
      final char[] r = new char[len - 1];
      Arrays.fill(r, '9');
      return r.length == 0 ? Z.ZERO : new Z(new String(r));
    }

    --p[i];
    NextPalindrome.mirror(p);
    return new Z(new String(p));
  }
}
