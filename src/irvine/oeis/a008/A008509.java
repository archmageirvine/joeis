package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.a000.A000217;
import irvine.util.string.StringUtils;

/**
 * A008509 Positive integers k such that k-th triangular number is palindromic.
 * @author Sean A. Irvine
 */
public class A008509 extends A000217 {

  {
    super.next();
  }

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (StringUtils.isPalindrome(t.toString())) {
        return Z.valueOf(mN);
      }
    }
  }
}

