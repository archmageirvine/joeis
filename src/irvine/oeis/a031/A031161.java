package irvine.oeis.a031;

import irvine.math.z.Z;
import irvine.oeis.a000.A000959;
import irvine.util.string.StringUtils;

/**
 * A031161 Palindromic lucky numbers.
 * @author Sean A. Irvine
 */
public class A031161 extends A000959 {

  @Override
  public Z next() {
    while (true) {
      final Z candidate = super.next();
      if (StringUtils.isPalindrome(candidate.toString())) {
        return candidate;
      }
    }
  }
}
