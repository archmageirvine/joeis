package irvine.oeis.a028;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.string.StringUtils;

/**
 * A028559 Palindromes of form n(n+5).
 * @author Sean A. Irvine
 */
public class A028559 implements Sequence {

  private Z mN = Z.NEG_ONE;
  
  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final Z u = mN.multiply(mN.add(5));
      if (StringUtils.isPalindrome(u.toString())) {
        return u;
      }
    }
  }
}
