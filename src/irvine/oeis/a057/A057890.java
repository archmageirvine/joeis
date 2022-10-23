package irvine.oeis.a057;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.StringUtils;

/**
 * A057890 In base 2, either a palindrome or becomes a palindrome if trailing 0's are omitted.
 * @author Sean A. Irvine
 */
public class A057890 extends Sequence1 {

  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      if (StringUtils.isPalindrome(Long.toBinaryString(++mN))) {
        return Z.valueOf(mN);
      }
      long m = mN;
      while ((m & 1) == 0) {
        m >>>= 1;
      }
      if (StringUtils.isPalindrome(Long.toBinaryString(m))) {
        return Z.valueOf(mN);
      }
    }
  }
}

