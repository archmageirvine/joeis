package irvine.oeis.a028;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.string.StringUtils;

/**
 * A028504 Palindromes of form k*(k+2); or palindromes 1 less than a square.
 * @author Sean A. Irvine
 */
public class A028504 implements Sequence {

  private Z mN = Z.NEG_ONE;
  
  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final Z t = mN.multiply(mN.add(2));
      if (StringUtils.isPalindrome(t.toString())) {
        return t;
      }
    }
  }
}
