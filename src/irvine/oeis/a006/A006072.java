package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.StringUtils;

/**
 * A006072 Numbers with mirror symmetry about middle.
 * @author Sean A. Irvine
 */
public class A006072 extends Sequence1 {

  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      final String base3 = Long.toString(++mN, 3);
      if (StringUtils.isPalindrome(base3)) {
        return new Z(base3.replace('2', '8'));
      }
    }
  }
}

