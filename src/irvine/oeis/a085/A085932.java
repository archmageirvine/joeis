package irvine.oeis.a085;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.StringUtils;

/**
 * A085932 Numbers k such that (digits of k sorted in ascending order) + (digital sum of k) is a palindrome.
 * @author Georg Fischer
 */
public class A085932 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final Z mK = Functions.DIGIT_SORT_ASCENDING.z(mN).add(Functions.DIGIT_SUM.l(mN));
      if (StringUtils.isPalindrome(mK.toString())) {
        return mN;
      }
    }
  }
}
