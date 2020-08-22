package irvine.oeis.a028;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.string.StringUtils;

/**
 * A028556 Palindromes of form n(n+4).
 * @author Sean A. Irvine
 */
public class A028556 implements Sequence {

  private Z mN = Z.NEG_ONE;
  
  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final Z u = mN.multiply(mN.add(4));
      if (StringUtils.isPalindrome(u.toString())) {
        return u;
      }
    }
  }
}
