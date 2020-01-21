package irvine.oeis.a028;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.string.StringUtils;

/**
 * A028414.
 * @author Sean A. Irvine
 */
public class A028414 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final Z p = mN.square().add(mN).add(1);
      if (StringUtils.isPalindrome(p.toString())) {
        return p;
      }
    }
  }
}
