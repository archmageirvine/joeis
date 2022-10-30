package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.util.string.StringUtils;

/**
 * A046486 Numbers k such that the sum of the first k palindromes is a palindrome.
 * @author Sean A. Irvine
 */
public class A046486 extends A046489 {

  private long mN = 0;
  {
    setOffset(1);
  }

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (StringUtils.isPalindrome(super.next().toString())) {
        return Z.valueOf(mN);
      }
    }
  }
}
