package irvine.oeis.a062;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A062286 Smallest palindromic n-th power larger than 1.
 * @author Sean A. Irvine
 */
public class A062286 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z k = Z.ONE;
    while (true) {
      k = k.add(1);
      final Z t = k.pow(mN);
      if (ZUtils.isPalindrome(t, 10)) {
        return t;
      }
    }
  }
}

