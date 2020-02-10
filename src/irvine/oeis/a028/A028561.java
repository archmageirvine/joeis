package irvine.oeis.a028;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.string.StringUtils;

/**
 * A028561 Numbers n such that <code>n(n+6)</code> is a palindrome.
 * @author Sean A. Irvine
 */
public class A028561 implements Sequence {

  private Z mN = Z.NEG_ONE;
  
  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (StringUtils.isPalindrome(mN.multiply(mN.add(6)).toString())) {
        return mN;
      }
    }
  }
}
