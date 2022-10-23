package irvine.oeis.a155;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.StringUtils;

/**
 * A155514 Larger of emirps (pairs) with digits 0 and 1 only.
 * @author Sean A. Irvine
 */
public class A155514 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final StringBuilder s = new StringBuilder(Long.toString(mN, 2)).append("1");
      final String ss = s.toString();
      if (!StringUtils.isPalindrome(ss)) {
        final Z z = new Z(ss);
        if (z.isProbablePrime()) {
          final Z t = new Z(s.reverse());
          if (z.compareTo(t) > 0 && t.isProbablePrime()) {
            return z;
          }
        }
      }
    }
  }
}

