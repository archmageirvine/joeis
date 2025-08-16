package irvine.oeis.a031;

import irvine.oeis.a013.A013648;

/**
 * A031790 Numbers k such that the period of the continued fraction for sqrt(k) contains exactly 22 ones.
 * @author Sean A. Irvine
 */
public class A031790 extends A013648 {

  @Override
  protected int targetOnes() {
    return 22;
  }
}
