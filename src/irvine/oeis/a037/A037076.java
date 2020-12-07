package irvine.oeis.a037;

import irvine.math.z.Z;
import irvine.oeis.a001.A001359;
import irvine.util.string.StringUtils;

/**
 * A037076.
 * @author Sean A. Irvine
 */
public class A037076 extends A001359 {

  @Override
  public Z next() {
    while (true) {
      final Z s = super.next().multiply2().add(2);
      if (StringUtils.isPalindrome(s.toString())) {
        return s;
      }
    }
  }
}
