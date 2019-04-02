package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.util.string.StringUtils;

/**
 * A008510 Both n and n-th triangular number are palindromes.
 * @author Sean A. Irvine
 */
public class A008510 extends A008509 {

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

