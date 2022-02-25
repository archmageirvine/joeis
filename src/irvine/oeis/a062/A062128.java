package irvine.oeis.a062;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;
import irvine.util.string.StringUtils;

/**
 * A062128 In base 2: start with n; if palindrome, stop; otherwise add to itself with digits reversed;
 * a(n) gives palindrome at which it stops, or -1 if no palindrome is ever reached.
 * Limit = 1024; copied from A033865.
 * @author Georg Fischer
 */
public class A062128 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    Z s = Z.valueOf(++mN);
    int loopCheck = 1024;
    while (--loopCheck >= 0 && !StringUtils.isPalindrome(s.toString(2))) {
      s = s.add(ZUtils.reverse(s, 2));
    }
    if (loopCheck < 0) {
      return Z.NEG_ONE;
    }
    return new Z(s.toString(2));
  }
}
