package irvine.oeis.a217;

import irvine.oeis.a051.A051278;

/**
 * A217126 Numbers n such that n = k/d(k) has exactly 5 solutions, where d(k) = number of divisors of k.
 * @author Sean A. Irvine
 */
public class A217126 extends A051278 {

  @Override
  protected int target() {
    return 5;
  }
}
