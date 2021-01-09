package irvine.oeis.a038;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000796;
import irvine.oeis.a002.A002113;
import irvine.util.string.StringUtils;

/**
 * A038101 First location of palindrome a(n) in decimal expansion of Pi is palindromic.
 * @author Sean A. Irvine
 */
public class A038101 extends A000796 {

  private final Sequence mPalindromes = new A002113();
  private final StringBuilder mPi = new StringBuilder();
  {
    super.next(); // skip 3
  }

  @Override
  public Z next() {
    while (true) {
      final Z p = mPalindromes.next();
      final String query = String.valueOf(p);
      int pos;
      while ((pos = mPi.indexOf(query)) < 0) {
        for (int k = 0; k < 1000; ++k) {
          mPi.append(super.next());
        }
      }
      if (StringUtils.isPalindrome(String.valueOf(pos + 1))) {
        return p;
      }
    }
  }
}
