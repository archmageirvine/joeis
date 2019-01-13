package irvine.oeis.a016;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.string.StringUtils;

/**
 * A016113.
 * @author Sean A. Irvine
 */
public class A016113 implements Sequence {

  private Z mN = Z.valueOf(835);

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final String s = mN.square().toString();
      if ((s.length() & 1) == 0 && StringUtils.isPalindrome(s)) {
        return mN;
      }
    }
  }
}
