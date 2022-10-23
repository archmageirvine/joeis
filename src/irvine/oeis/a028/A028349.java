package irvine.oeis.a028;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.StringUtils;

/**
 * A028349 Palindromes of form n^2 + 3*n + 1.
 * @author Sean A. Irvine
 */
public class A028349 extends Sequence1 {

  private Z mN = Z.NEG_ONE;
  
  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final Z u = mN.add(3).multiply(mN).add(1);
      if (StringUtils.isPalindrome(u.toString())) {
        return u;
      }
    }
  }
}
