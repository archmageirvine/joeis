package irvine.oeis.a028;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.string.StringUtils;

/**
 * A028562 Palindromes of form <code>n(n+6)</code>.
 * @author Sean A. Irvine
 */
public class A028562 implements Sequence {

  private Z mN = Z.NEG_ONE;
  
  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final Z u = mN.multiply(mN.add(6));
      if (StringUtils.isPalindrome(u.toString())) {
        return u;
      }
    }
  }
}
