package irvine.oeis.a028;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.StringUtils;

/**
 * A028336 Positive numbers k such that k*(k+1) is a palindrome.
 * @author Sean A. Irvine
 */
public class A028336 extends Sequence1 {

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
