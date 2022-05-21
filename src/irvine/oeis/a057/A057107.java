package irvine.oeis.a057;

import irvine.math.z.Z;
import irvine.oeis.a000.A000567;
import irvine.util.string.StringUtils;

/**
 * A057107 Octagonal palindromes.
 * @author Sean A. Irvine
 */
public class A057107 extends A000567 {

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (StringUtils.isPalindrome(t.toString())) {
        return t;
      }
    }
  }
}
