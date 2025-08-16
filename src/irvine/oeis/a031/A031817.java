package irvine.oeis.a031;

import irvine.oeis.a013.A013648;

/**
 * A031817 Numbers k such that the period of the continued fraction for sqrt(k) contains exactly 49 ones.
 * @author Sean A. Irvine
 */
public class A031817 extends A013648 {

  @Override
  protected int targetOnes() {
    return 49;
  }
}
