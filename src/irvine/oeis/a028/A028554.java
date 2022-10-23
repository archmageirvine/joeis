package irvine.oeis.a028;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.StringUtils;

/**
 * A028554 Palindromes of form n(n+3).
 * @author Sean A. Irvine
 */
public class A028554 extends Sequence1 {

  private Z mN = Z.NEG_ONE;
  
  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final Z u = mN.multiply(mN.add(3));
      if (StringUtils.isPalindrome(u.toString())) {
        return u;
      }
    }
  }
}
