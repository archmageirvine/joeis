package irvine.oeis.a031;

import irvine.oeis.a013.A013648;

/**
 * A031792 Numbers k such that the period of the continued fraction for sqrt(k) contains exactly 24 ones.
 * @author Sean A. Irvine
 */
public class A031792 extends A013648 {

  @Override
  protected int targetOnes() {
    return 24;
  }
}
