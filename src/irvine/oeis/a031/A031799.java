package irvine.oeis.a031;

import irvine.oeis.a013.A013648;

/**
 * A031799 Numbers k such that the period of the continued fraction for sqrt(k) contains exactly 31 ones.
 * @author Sean A. Irvine
 */
public class A031799 extends A013648 {

  @Override
  protected int targetOnes() {
    return 31;
  }
}
