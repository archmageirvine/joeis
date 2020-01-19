package irvine.oeis.a028;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.string.StringUtils;

/**
 * A028386 Numbers k such that <code>k*(3k-1)/2</code> is a pentagonal palindrome.
 * @author Sean A. Irvine
 */
public class A028386 implements Sequence {

  private Z mN = Z.ZERO;
  
  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (StringUtils.isPalindrome(mN.multiply(mN.multiply(3).subtract(1)).divide2().toString())) {
        return mN;
      }
    }
  }
}
