package irvine.oeis.a028;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.StringUtils;

/**
 * A028980 Numbers whose sum of divisors is palindromic.
 * @author Sean A. Irvine
 */
public class A028980 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (StringUtils.isPalindrome(Functions.SIGMA.z(mN).toString())) {
        return mN;
      }
    }
  }
}
