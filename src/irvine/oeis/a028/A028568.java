package irvine.oeis.a028;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.string.StringUtils;

/**
 * A028568 Palindromes of form n(n+8).
 * @author Sean A. Irvine
 */
public class A028568 implements Sequence {

  private Z mN = Z.NEG_ONE;
  
  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final Z u = mN.multiply(mN.add(8));
      if (StringUtils.isPalindrome(u.toString())) {
        return u;
      }
    }
  }
}
