package irvine.oeis.a062;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a000.A000040;

/**
 * A062888 Smallest palindromic multiple of n-th prime.
 * @author Sean A. Irvine
 */
public class A062888 extends A000040 {

  @Override
  public Z next() {
    final Z p = super.next();
    Z q = p;
    while (!ZUtils.isPalindrome(q, 10)) {
      q = q.add(p);
    }
    return q;
  }
}

