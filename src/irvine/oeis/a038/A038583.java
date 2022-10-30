package irvine.oeis.a038;

import irvine.math.z.Z;
import irvine.oeis.a007.A007504;
import irvine.util.string.StringUtils;

/**
 * A038583 Palindromes that are the sum of consecutive initial primes.
 * @author Sean A. Irvine
 */
public class A038583 extends A007504 {

  {
    setOffset(1);
    super.next(); // skip 0
  }

  @Override
  public Z next() {
    while (true) {
      final Z sum = super.next();
      if (StringUtils.isPalindrome(sum.toString())) {
        return sum;
      }
    }
  }
}
