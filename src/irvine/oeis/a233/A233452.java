package irvine.oeis.a233;

import irvine.oeis.a052.A052210;

/**
 * A233452 Numbers n such that n^6 starts with n itself (in base 10).
 * @author Sean A. Irvine
 */
public class A233452 extends A052210 {

  @Override
  protected int power() {
    return 6;
  }
}
