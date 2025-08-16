package irvine.oeis.a031;

import irvine.oeis.a013.A013648;

/**
 * A031868 Numbers k such that the period of the continued fraction for sqrt(k) contains exactly 100 ones.
 * @author Sean A. Irvine
 */
public class A031868 extends A013648 {

  @Override
  protected int targetOnes() {
    return 100;
  }
}
