package irvine.oeis.a065;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence2;

/**
 * A065809 a(n) is the smallest number m &gt; n such that m is palindromic in base n and is not palindromic in bases b with 2 &lt;= b &lt; n.
 * @author Sean A. Irvine
 */
public class A065809 extends Sequence2 {

  private long mN = 1;

  private boolean is(final Z m) {
    if (!ZUtils.isPalindrome(m, mN)) {
      return false;
    }
    for (long b = mN - 1; b >= 2; --b) {
      if (ZUtils.isPalindrome(m, b)) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    Z m = Z.valueOf(++mN);
    while (true) {
      m = m.add(1);
      if (is(m)) {
        return m;
      }
    }
  }
}
