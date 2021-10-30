package irvine.oeis.a233;

import irvine.oeis.a052.A052210;

/**
 * A233451 Numbers n such that n^5 starts with n itself (in base 10).
 * @author Sean A. Irvine
 */
public class A233451 extends A052210 {

  @Override
  protected int power() {
    return 5;
  }
}
