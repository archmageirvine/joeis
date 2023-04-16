package irvine.oeis.a062;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence0;

/**
 * A062932 a(0) = 0; a(n) = smallest number &gt; a(n-1) such that a(n-1)+a(n) is a palindrome.
 * @author Sean A. Irvine
 */
public class A062932 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ZERO;
      return Z.ZERO;
    }
    Z t = mA;
    while (true) {
      t = t.add(1);
      if (ZUtils.isPalindrome(mA.add(t), 10)) {
        mA = t;
        return t;
      }
    }
  }
}

