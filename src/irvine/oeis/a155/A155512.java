package irvine.oeis.a155;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.string.StringUtils;

/**
 * A155512.
 * @author Sean A. Irvine
 */
public class A155512 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final StringBuilder s = new StringBuilder(Long.toString(mN, 2)).append("1");
      final String ss = s.toString();
      if (!StringUtils.isPalindrome(ss)) {
        final Z z = new Z(ss);
        if (z.isProbablePrime() && new Z(s.reverse().toString()).isProbablePrime()) {
          return z;
        }
      }
    }
  }
}

