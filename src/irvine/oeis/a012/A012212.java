package irvine.oeis.a012;

import irvine.math.z.Z;
import irvine.oeis.a006.A006156;
import irvine.util.string.StringUtils;

/**
 * A012212 Number of squarefree palindromes over <code>{0, 1, 2}</code> of length <code>2n+1</code>.
 * @author Sean A. Irvine
 */
public class A012212 extends A006156 {

  @Override
  public Z next() {
    super.next(); // even step
    super.next(); // odd step
    long c = 0;
    for (final String s : mWords) {
      if (StringUtils.isPalindrome(s)) {
        ++c;
      }
    }
    return Z.valueOf(c);
  }
}
