package irvine.oeis.a028;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.string.StringUtils;

/**
 * A028337 Palindromes of form n(n+1).
 * @author Sean A. Irvine
 */
public class A028337 implements Sequence {

  private Z mN = Z.ONE;
  
  @Override
  public Z next() {
    while (true) {
      final Z t = mN;
      mN = mN.add(1);
      final Z u = mN.multiply(t);
      if (StringUtils.isPalindrome(u.toString())) {
        return u;
      }
    }
  }
}
