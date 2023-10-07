package irvine.oeis.a059;

import irvine.math.z.Z;
import irvine.oeis.a002.A002778;
import irvine.util.string.StringUtils;

/**
 * A059744 Numbers k such that k^2 is a palindromic square of sporadic type.
 * @author Sean A. Irvine
 */
public class A059744 extends A002778 {

  /*
  The "binary root" family of palindromic squares all have palindromic roots with an even number of digits. The digits of the roots are either 0 or 1, with no more than eight 1s appearing in the root. The root can therefore be expressed as 1[x][x]'1, where [x] is a string of zero or more of the digits 0 and 1 (with the 1 digit occurring no more than three times in the string), and [x]' is the string [x] with all the digits in reverse order. The simplest examples of these palindromic squares include: 11^2 = 121, 1001^2 = 1002001, 1111^2 = 1234321, 100001^2 = 10000200001, 101101^2 = 10221412201, 110011^2 = 12102420121, 111111^2 = 12345654321, and so on.
   */
  private boolean isBinaryRootFamily(final String p) {
    if ((p.length() & 1) != 0 || !p.matches("1[01]*1")) {
      return false;
    }
    int ones = 0;
    for (int k = 0; k < p.length(); ++k) {
      if (p.charAt(k) == '1') {
        ++ones;
      }
    }
    if (ones > 8) {
      return false;
    }
    final int end = p.length() / 2;
    for (int k = 1; k < end; ++k) {
      final char c = p.charAt(k);
      final char d = p.charAt(p.length() - 1 - k);
      if (c != d) {
        return false;
      }
    }
    return true;
  }

  /*
  The "ternary root" family are palindromic squares whose roots do not contain any digits greater than 2. The roots all palindromes will have an odd number of digits greater than 1. The roots are of the form 1[x]y[x]'1, where [x] and [x]' are defined as for the binary root family, and y is either 0, 1 or 2. If y = 2 then the string [x] has at most one 1, otherwise if y < 2 then [x] has at most three 1s. The total number of possible roots with D digits (D must be odd) which generate ternary root palindromic squares is expressed by the formula (N^3 - 9N^2 + 59N - 51)/24. The simplest examples of the palindromic squares of this family include: 101^2 = 10201, 111^2 = 12321, 121^2 = 14641, 10001^2 = 100020001, 10101^2 = 102030201, 10201^2 = 104060401, and so on.
   */
  private boolean isTernaryRootFamily(final String p) {
    if ((p.length() & 1) != 1 || !p.matches("1[01]*[012][01]*1")) {
      return false;
    }
    final int end = (p.length() - 1) / 2;
    for (int k = 1; k < end; ++k) {
      final char c = p.charAt(k);
      final char d = p.charAt(p.length() - 1 - k);
      if (c != d) {
        return false;
      }
    }
    return true;
  }

  /*
  The third family is known as the "even root" family, in which the roots are even numbers. The roots are of the form 2[0]2 (when the number of digits is even), or 2[0]x[0]2 (when the number of digits is odd). Here the expression [0] is a string of zero or more 0s, and x is either 0 or 1. If the root consists of D digits, only one palindromic square can result when D is even, and two when D is odd. The first few members of this family include: 22^2 = 484, 202^2 = 40804, 212^2 = 44944, 2002^2 = 4008004, 20002^2 = 400080004, 20102^2 = 404090404, etc.
   */
  private boolean isEvenRootFamily(final String p) {
    if ((p.length() & 1) == 0) {
      return p.matches("20*2");
    } else {
      final int zeros = (p.length() - 3) / 2;
      return p.matches("20{" + zeros + "}.0{" + zeros + "}2");
    }
  }

  /*
  The most interesting family recognised by Keith are the "asymmetric root" family. Their roots are always non-palindromic with at least seven digits, and an odd number of digits in those roots. In this family the root is of the form 1(x)0[9]9[0]1(x)'1, where (x) represents a string of at least one of the digits 0 and 1, while [0] and [9] are strings of zero or more 0s and 9s respectively. The string (x)' is the same as (x) but with the order of digits reversed. The first few members of this family include: 1109111^2 = 1230127210321, 110091011^2 = 1212003070300121, 111091111^2 = 12341234943214321, and so on.
   */

  /**
   * Test for a square palindrome belonging to the asymmetric family.
   * @param p palindrome to test
   * @return true if an asymmetric palindrome
   */
  public static boolean isAsymmetricRootFamily(final String p) {
    if (p.length() < 7 || (p.length() & 1) == 0) {
      return false;
    }
    if (StringUtils.isPalindrome(p)) {
      return false;
    }
    if (!p.matches("1[01]+09+0*1[01]+1")) {
      return false;
    }
    for (int k = 1; p.charAt(k + 1) != '9'; ++k) {
      final char c = p.charAt(k);
      final char d = p.charAt(p.length() - 1 - k);
      if (c != d) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (Z.TEN.compareTo(p) > 0) {
        continue;
      }
      final String s = p.toString();
      if (isBinaryRootFamily(s)) {
        continue;
      }
      if (isTernaryRootFamily(s)) {
        continue;
      }
      if (isEvenRootFamily(s)) {
        continue;
      }
      if (isAsymmetricRootFamily(s)) {
        continue;
      }
      return p;
    }
  }
}
