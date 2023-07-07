package irvine.oeis.a058;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a071.A071904;
import irvine.util.string.StringUtils;

/**
 * A058849 Sum of odd composites up to n is palindromic.
 * @author Sean A. Irvine
 */
public class A058849 extends Sequence1 {

  private final Sequence mA = new A071904();
  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      final Z t = mA.next();
      mN = mN.add(t);
      if (StringUtils.isPalindrome(mN.toString())) {
        return t;
      }
    }
  }
}
