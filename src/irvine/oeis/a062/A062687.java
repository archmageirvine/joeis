package irvine.oeis.a062;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a002.A002113;

/**
 * A062686.
 * @author Sean A. Irvine
 */
public class A062687 extends A002113 {

  {
    super.next();
  }

  private boolean is(final Z p) {
    for (final Z d : Jaguar.factor(p).divisors()) {
      if (!ZUtils.isPalindrome(d, 10)) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (is(p)) {
        return p;
      }
    }
  }
}
