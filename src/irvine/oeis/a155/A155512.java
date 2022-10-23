package irvine.oeis.a155;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.StringUtils;

/**
 * A155512 Emirps with digits 0 and 1 only.
 * @author Sean A. Irvine
 */
public class A155512 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final StringBuilder s = new StringBuilder(Long.toString(mN, 2)).append("1");
      final String ss = s.toString();
      if (!StringUtils.isPalindrome(ss)) {
        final Z z = new Z(ss);
        if (z.isProbablePrime() && new Z(s.reverse()).isProbablePrime()) {
          return z;
        }
      }
    }
  }
}

