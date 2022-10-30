package irvine.oeis.a038;

import irvine.math.z.Z;
import irvine.oeis.a007.A007504;
import irvine.util.string.StringUtils;

/**
 * A038582 Numbers k such that sum of the first k primes is a palindrome.
 * @author Sean A. Irvine
 */
public class A038582 extends A007504 {

  {
    setOffset(1);
    super.next(); // skip 0
  }
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (StringUtils.isPalindrome(super.next().toString())) {
        return Z.valueOf(mN);
      }
    }
  }
}
