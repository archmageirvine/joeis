package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;
import irvine.util.string.StringUtils;

/**
 * A046941.
 * @author Sean A. Irvine
 */
public class A046941 extends A000040 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final Z p = super.next();
      if (StringUtils.isPalindrome(p.toString()) && StringUtils.isPalindrome(String.valueOf(mN))) {
        return p;
      }
    }
  }
}
