package irvine.oeis.a050;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.StringUtils;

/**
 * A050430 Length of longest palindromic subword of (n base 2).
 * @author Sean A. Irvine
 */
public class A050430 extends Sequence1 {

  private long mN = 0;

  protected int base() {
    return 2;
  }

  @Override
  public Z next() {
    final String s = Long.toString(++mN, base());
    for (int k = s.length(); k > 0; --k) {
      for (int j = 0; j + k <= s.length(); ++j) {
        if (StringUtils.isPalindrome(s.substring(j, j + k))) {
          return Z.valueOf(k);
        }
      }
    }
    throw new RuntimeException();
  }
}
