package irvine.oeis.a028;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.string.StringUtils;

/**
 * A028336 Positive numbers k such that <code>k*(k+1)</code> is a palindrome.
 * @author Sean A. Irvine
 */
public class A028336 implements Sequence {

  private Z mN = Z.ONE;
  
  @Override
  public Z next() {
    while (true) {
      final Z t = mN;
      mN = mN.add(1);
      if (StringUtils.isPalindrome(mN.multiply(t).toString())) {
        return t;
      }
    }
  }
}
