package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.oeis.a002.A002113;
import irvine.util.string.StringUtils;

/**
 * A046498 Palindromes expressible as the sum of 3 consecutive palindromes.
 * @author Sean A. Irvine
 */
public class A046498 extends A002113 {

  {
    super.next(); // skip 0
  }

  private Z mA = super.next();
  private Z mB = super.next();

  @Override
  public Z next() {
    while (true) {
      final Z t = mA;
      mA = mB;
      mB = super.next();
      final Z s = t.add(mA).add(mB);
      if (StringUtils.isPalindrome(s.toString())) {
        return s;
      }
    }
  }
}
