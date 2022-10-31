package irvine.oeis.a058;

import irvine.math.z.Z;
import irvine.oeis.a071.A071148;
import irvine.util.string.StringUtils;

/**
 * A058845 Numbers n such that the sum of the first n odd primes is palindromic.
 * @author Sean A. Irvine
 */
public class A058845 extends A071148 {

  private long mN = 0;
  {
  }

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final Z t = super.next();
      if (StringUtils.isPalindrome(t.toString())) {
        return Z.valueOf(mN);
      }
    }
  }
}
