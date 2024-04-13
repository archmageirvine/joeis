package irvine.oeis.a062;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A062936 Numbers n such that n*R(n) is a palindrome, where R(n) (A004086) = digit reversal.
 * @author Sean A. Irvine
 */
public class A062936 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (ZUtils.isPalindrome(mN.multiply(Functions.REVERSE.z(mN)), 10)) {
        return mN;
      }
    }
  }
}

