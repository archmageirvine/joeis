package irvine.oeis.a016;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;
import irvine.util.string.StringUtils;

/**
 * A016016 Number of iterations of Reverse and Add which lead to a palindrome, or <code>-1</code> if no palindrome is ever reached.
 * @author Sean A. Irvine
 */
public class A016016 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    Z a = Z.valueOf(++mN);
    long k = 0;
    while (true) {
      ++k;
      a = ZUtils.reverse(a).add(a);
      if (StringUtils.isPalindrome(a.toString())) {
        return Z.valueOf(k);
      }
    }
  }
}
