package irvine.oeis.a085;

import irvine.math.z.Z;
import irvine.util.string.StringUtils;

/**
 * A085933 Palindromes in A085932.
 * @author Georg Fischer
 */
public class A085933 extends A085932 {

  @Override
  public Z next() {
    while (true) {
      final Z mK = super.next();
      if (StringUtils.isPalindrome(mK.toString())) {
        return mK;
      }
    }
  }
}
