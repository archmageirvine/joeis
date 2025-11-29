package irvine.oeis.a082;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.string.StringUtils;

/**
 * A082216 Smallest palindrome beginning with n.
 * @author Sean A. Irvine
 */
public class A082216 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    final String s = String.valueOf(++mN);
    final StringBuilder rev = new StringBuilder(s).reverse();
    for (int k = s.length(); k >= 0; --k) {
      final String t = s + rev.substring(k);
      if (StringUtils.isPalindrome(t)) {
        return new Z(t);
      }
    }
    throw new RuntimeException();
  }
}
