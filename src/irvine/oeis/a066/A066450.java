package irvine.oeis.a066;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence2;

/**
 * A066450 a(n) is the conjectured value of the minimal number to which repeated application of the "reverse and add!" algorithm in base n does not terminate in a palindrome. If there is no such number in base n, then a(n) := -1.
 * @author Sean A. Irvine
 */
public class A066450 extends Sequence2 {

  private static final int HEURISTIC_BIT_LENGTH = 1000;
  private int mN = 1;

  private boolean is(final int base, Z m) {
    while (true) {
      if (ZUtils.isPalindrome(m, base)) {
        return false;
      }
      if (m.bitLength() > HEURISTIC_BIT_LENGTH) {
        return true;
      }
      m = ZUtils.reverse(m, base).add(m);
    }
  }

  @Override
  public Z next() {
    ++mN;
    Z k = Z.ONE;
    while (true) {
      k = k.add(1);
      if (is(mN, k)) {
        return k;
      }
    }
  }
}
