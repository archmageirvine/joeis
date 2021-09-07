package irvine.oeis.a217;

import irvine.oeis.a051.A051278;

/**
 * A217127 Numbers n such that n = k/d(k) has exactly 6 solutions, where d(k) = number of divisors of k.
 * @author Sean A. Irvine
 */
public class A217127 extends A051278 {

  @Override
  protected int target() {
    return 6;
  }
}
