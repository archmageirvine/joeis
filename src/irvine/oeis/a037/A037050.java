package irvine.oeis.a037;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.string.StringUtils;

/**
 * A037050 Numbers n such that product of n with sum of next n consecutive integers is palindromic.
 * @author Sean A. Irvine
 */
public class A037050 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final Z n = Z.valueOf(++mN);
      if (StringUtils.isPalindrome(n.square().multiply(3 * mN + 1).divide2().toString())) {
        return n;
      }
    }
  }
}
