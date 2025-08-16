package irvine.oeis.a031;

import irvine.oeis.a013.A013648;

/**
 * A031854 Numbers k such that the period of the continued fraction for sqrt(k) contains exactly 86 ones.
 * @author Sean A. Irvine
 */
public class A031854 extends A013648 {

  @Override
  protected int targetOnes() {
    return 86;
  }
}
