package irvine.oeis.a028;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.string.StringUtils;

/**
 * A028817.
 * @author Sean A. Irvine
 */
public class A028817 implements Sequence {

  private Z mN = Z.ZERO;
  
  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final Z n2 = mN.square();
      final String s = n2.toString();
      if ((s.length() & 1) == 1 && StringUtils.isPalindrome(s)) {
        return n2;
      }
    }
  }
}
