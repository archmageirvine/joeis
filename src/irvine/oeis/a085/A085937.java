package irvine.oeis.a085;

import irvine.math.z.Z;
import irvine.util.string.StringUtils;

/**
 * A085937 Palindromes in A085936.
 * @author Georg Fischer
 */
public class A085937 extends A085936 {

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
