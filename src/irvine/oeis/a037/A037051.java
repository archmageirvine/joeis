package irvine.oeis.a037;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.StringUtils;

/**
 * A037051 Palindromic product of some n with sum of next n consecutive integers.
 * @author Sean A. Irvine
 */
public class A037051 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final Z t = Z.valueOf(++mN).square().multiply(3 * mN + 1).divide2();
      if (StringUtils.isPalindrome(t.toString())) {
        return t;
      }
    }
  }
}
