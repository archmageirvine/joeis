package irvine.math.function;

import irvine.math.z.Z;

/**
 * Return the next palindrome not less than the given number.
 * @author Sean A. Irvine
 */
class NextPalindrome extends AbstractFunction1 {

  private static void mirror(final char[] a) {
    int i = 0;
    int j = a.length - 1;
    while (i < j) {
      a[j--] = a[i++];
    }
  }

  @Override
  public Z z(final Z n) {
    final String s = n.toString();
    final int len = s.length();
    final char[] p = s.toCharArray();
    mirror(p);
    final Z candidate = new Z(new String(p));
    if (candidate.compareTo(n) >= 0) {
      return candidate;
    }
    // increment the middle and propagate carry
    int i = (len - 1) / 2; // middle for odd, left-middle for even
    while (i >= 0 && p[i] == '9') {
      p[i--] = '0';
    }

    if (i < 0) {
      // overflow like 999 -> 1001
      final char[] r = new char[len + 1];
      r[0] = '1';
      r[len] = '1';
      for (int k = 1; k < len; ++k) {
        r[k] = '0';
      }
      return new Z(new String(r));
    }
    ++p[i];
    // mirror again after increment
    mirror(p);
    return new Z(new String(p));
  }
}
