package irvine.oeis.a033;

import irvine.math.group.IntegersModMul;
import irvine.math.z.Z;
import irvine.oeis.a002.A002385;
import irvine.util.string.StringUtils;

/**
 * A033938 Palindromic primes n such that the period of <code>1/n</code> is a palindrome.
 * @author Sean A. Irvine
 */
public class A033938 extends A002385 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (Z.TWO.equals(p) || Z.FIVE.equals(p)) {
        return p;
      }
      final IntegersModMul r = new IntegersModMul(p);
      final Z period = r.order(Z.TEN.mod(p));
      if (StringUtils.isPalindrome(period.toString())) {
        return p;
      }
    }
  }
}
