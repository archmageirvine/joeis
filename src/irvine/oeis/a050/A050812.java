package irvine.oeis.a050;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.string.StringUtils;

/**
 * A050812 Number of times n is palindromic in bases b, 2 &lt;= b &lt;= 10.
 * @author Sean A. Irvine
 */
public class A050812 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    int cnt = 0;
    for (int b = 2; b <= 10; ++b) {
      if (StringUtils.isPalindrome(Long.toString(mN, b))) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}
