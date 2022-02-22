package irvine.oeis.a062;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;
import irvine.util.string.StringUtils;

/**
 * A062130 A062128 written in base 10.
 * Limit = 1024.
 * @author Georg Fischer
 */
public class A062130 implements Sequence {

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
    return s;
  }
}
