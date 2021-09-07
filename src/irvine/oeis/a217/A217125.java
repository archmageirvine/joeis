package irvine.oeis.a217;

import irvine.oeis.a051.A051278;

/**
 * A217125 Numbers n such that n = k/d(k) has exactly 4 solutions, where d(k) = number of divisors of k.
 * @author Sean A. Irvine
 */
public class A217125 extends A051278 {

  @Override
  protected int target() {
    return 4;
  }
}
