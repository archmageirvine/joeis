package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;
import irvine.util.string.StringUtils;

/**
 * A033865 Start with n; if palindrome, stop; otherwise add to itself with digits reversed; <code>a(n)</code> gives palindrome at which it stops, or -1 if no palindrome is ever reached.
 * @author Sean A. Irvine
 */
public class A033865 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    Z s = Z.valueOf(++mN);
    while (!StringUtils.isPalindrome(s.toString())) {
      s = s.add(ZUtils.reverse(s));
    }
    return s;
  }
}
